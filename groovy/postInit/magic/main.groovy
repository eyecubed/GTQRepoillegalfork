import net.minecraftforge.oredict.OreDictionary
import net.minecraft.item.ItemStack

println "Running full gem quality recipe script (fixed base name detection)"

// Stages from worst to best
def qualityStages = ['Chipped', 'Flawed', '', 'Flawless', 'Exquisite']
def oreDictKeys = OreDictionary.getOreNames()

// Step 1: Find real gem base names — those that appear in at least 2 quality stages
def potentialBaseNames = [:].withDefault { 0 }

oreDictKeys.each { key ->
    qualityStages.each { stage ->
        def prefix = "gem${stage}"
        if (key.startsWith(prefix)) {
            def suffix = key.substring(prefix.length())
            if (suffix) potentialBaseNames[suffix] += 1
        }
    }
}

// Only use those seen in at least 2 stages
def baseGemNames = potentialBaseNames.findAll { k, v -> v >= 2 }.keySet()
println "Valid base gem names: ${baseGemNames}"

// Utility to get first OreDict item
def getOreItem(String key) {
    def list = OreDictionary.getOres(key)
    return (list && !list.isEmpty()) ? list[0] : null
}

baseGemNames.each { gemName ->
    println "\nProcessing gem chain for: ${gemName}"

    // ------- UPGRADE Chain (Vitreus) -------
    for (int i = 0; i < qualityStages.size() - 1; i++) {
        def fromKey = "gem${qualityStages[i]}${gemName}"
        def toKey = "gem${qualityStages[i + 1]}${gemName}"

        def fromItem = getOreItem(fromKey)
        def toItem = getOreItem(toKey)

        if (fromItem && toItem) {
            println "Registering UPGRADE: ${fromKey} -> ${toKey}"
            mods.thaumcraft.crucible.recipeBuilder()
                .researchKey('FIRSTSTEPS')
                .catalyst(fromItem)
                .output(toItem)
                .aspect(aspect('vitreus') * (25 * (i + 1)))
                .register()
        } else {
            println "Skipping upgrade: ${fromKey} or ${toKey} not found"
        }
    }

    // ------- DOWNGRADE Chain (Vitium, 3x Output) -------
    for (int i = qualityStages.size() - 1; i > 0; i--) {
        def fromKey = "gem${qualityStages[i]}${gemName}"
        def toKey = "gem${qualityStages[i - 1]}${gemName}"

        def fromItem = getOreItem(fromKey)
        def toItem = getOreItem(toKey)

        if (fromItem && toItem) {
            def outputStack = new ItemStack(toItem.item, 3, toItem.metadata)
            println "Registering DOWNGRADE: ${fromKey} -> 3x ${toKey}"
            mods.thaumcraft.crucible.recipeBuilder()
                .researchKey('FIRSTSTEPS')
                .catalyst(fromItem)
                .output(outputStack)
                .aspect(aspect('perditio') * (20 * (6 - i)))
                .register()
        } else {
            println "Skipping downgrade: ${fromKey} or ${toKey} not found"
        }
    }
}

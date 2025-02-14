import net.minecraftforge.oredict.OreDictionary

println "Running script during postInit phase"

// Get all OreDict keys
def oreDictKeys = OreDictionary.getOreNames()
println "All Ore Dictionary Keys: ${oreDictKeys}"

// Filter chipped gems
def chippedGems = oreDictKeys.findAll { it.startsWith("gemChipped") }
println "Found Chipped Gems: ${chippedGems}"

chippedGems.each { chippedKey ->
    def gemName = chippedKey.replaceFirst("gemChipped", "")
    def flawedKey = "gemFlawed${gemName}"  // Format like gemFlawedRuby

    def chippedList = OreDictionary.getOres(chippedKey)
    def flawedList = OreDictionary.getOres(flawedKey)

    if (chippedList && flawedList) {
        def chippedItem = chippedList[0]
        def flawedItem = flawedList[0]
        println "Registering Crucible Recipe for ${gemName}: ${chippedItem} -> ${flawedItem}"

        // Register the crucible recipe for chipped gem to flawed gem
        mods.thaumcraft.crucible.recipeBuilder()
            .researchKey('FIRSTSTEPS')
            .catalyst(chippedItem)
            .output(flawedItem)
            .aspect(aspect('vitreus') * 25)  // Vitreus aspect for transformation
            .register()
    } else {
        println "Skipping ${chippedKey}: Missing flawed gem variant (${flawedKey})"
    }
}

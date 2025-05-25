import net.minecraftforge.oredict.OreDictionary

println "Running script during postInit phase"

// Get all OreDict keys
def oreDictKeys = OreDictionary.getOreNames()
println "All Ore Dictionary Keys: ${oreDictKeys}"

// Filter ores and crushed variants
def oreEntries = oreDictKeys.findAll { it.startsWith("ore") }
println "Found Ore Entries: ${oreEntries}"

oreEntries.each { oreKey ->
    def oreName = oreKey.replaceFirst("ore", "")
    def crushedKey = "crushed${oreName}"

    def inputList = OreDictionary.getOres(oreKey)
    def outputList = OreDictionary.getOres(crushedKey)

    if (inputList && outputList) {
        def inputItem = inputList[0]
        def outputItem = outputList[0]
        println "Registering Recipe for ${oreName}: ${inputItem} -> ${outputItem}"

        mods.pyrotech.anvil.recipeBuilder()
            .input(inputItem)
            .output(outputItem)
            .hits(12)
            .typePickaxe()
            .tierIronclad()
            .name("orecrush_${oreName.toLowerCase()}")
            .register()
    } else {
        println "Skipping ${oreKey}: Missing crushed variant (${crushedKey})"
    }
}

import net.minecraftforge.oredict.OreDictionary

println "Running script during postInit phase"

// Get all OreDict keys
def oreDictKeys = OreDictionary.getOreNames()
println "All Ore Dictionary Keys: ${oreDictKeys}"

// Filter crushed purified ores
def oreEntries = oreDictKeys.findAll { it.startsWith("crushedPurified") }
println "Found Ore Entries: ${oreEntries}"

oreEntries.each { oreKey ->
    def oreName = oreKey.replaceFirst("crushedPurified", "")
    def smallDustKey = "dustSmall${oreName.capitalize()}"  // Format like dustSmallDiamond

    def inputList = OreDictionary.getOres(oreKey)
    def outputList = OreDictionary.getOres(smallDustKey)

    if (inputList && outputList) {
        def inputItem = inputList[0]
        def outputItem = outputList[0]
        println "Registering Anvil Recipe for ${oreName}: ${inputItem} -> ${outputItem}"

        // Register the anvil recipe for the crushed purified ore into the small dust
        mods.pyrotech.anvil.recipeBuilder()
            .input(inputItem)
            .output(outputItem)  // Output the small dust variant
            .hits(2)  // 2 hits required
            .typePickaxe()  // Requires a pickaxe
            .tierIronclad()  // Ironclad tier
            .name("${oreName.toLowerCase()}_oreproc3")  // Unique recipe name
            .register()
    } else {
        println "Skipping ${oreKey}: Missing small dust variant (${smallDustKey})"
    }
}

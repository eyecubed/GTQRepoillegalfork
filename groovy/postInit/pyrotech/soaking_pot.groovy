import net.minecraftforge.oredict.OreDictionary

println "Running script during postInit phase"

// get key
def oreDictKeys = OreDictionary.getOreNames()
println "All Ore Dictionary Keys: ${oreDictKeys}"

// Filter ores and crushed holy shit ae2 reference *balls*
def oreEntries = oreDictKeys.findAll { it.startsWith("crushed") }
println "Found Ore Entries: ${oreEntries}"

oreEntries.each { oreKey ->
    def oreName = oreKey.replaceFirst("crushed", "")
    def crushedPurifiedKey = "crushedPurified${oreName}"

    def inputList = OreDictionary.getOres(oreKey)
    def outputList = OreDictionary.getOres(crushedPurifiedKey)

    if (inputList && outputList) {
        def inputItem = inputList[0]
        def outputItem = outputList[0]
        println "Registering Soaking Pot Recipe for ${oreName}: ${inputItem} -> ${outputItem}"

        // reegister soaking pot recipe
        mods.pyrotech.soaking_pot.recipeBuilder()
            .input(inputItem)
            .fluidInput(fluid('water') * 250)
            .output(outputItem)
            .time(2400)
            .campfireRequired(true)// hahahahaha fuck you
            .name("oreproc_${oreName.toLowerCase()}_crushed_purified")  // MASSIVE, UNADULTERATED MEN
            .register()
    } else {
        println "Skipping ${oreKey}: Missing crushed purified variant (${crushedPurifiedKey})"
    }
}
// cooper
        mods.pyrotech.soaking_pot.recipeBuilder()
            .input(ore('dustMalachite'))
            .fluidInput(fluid('water') * 250)
            .output(item('gregtech:meta_dust_small', 25))
            .time(4000)
            .campfireRequired(true)// hahahahaha fuck you
            .name("oreproc_malachite_crushed_purified")  
            .register()

        mods.pyrotech.soaking_pot.recipeBuilder()
            .input(ore('dustChalcopyrite'))
            .fluidInput(fluid('water') * 250)
            .output(item('gregtech:meta_dust_small', 25))
            .time(4000)
            .campfireRequired(true)// hahahahaha fuck you
            .name("oreproc_chalcopyrite_crushed_purified")  
            .register()

        mods.pyrotech.soaking_pot.recipeBuilder()
            .input(ore('dustTetrahedrite'))
            .fluidInput(fluid('water') * 250)
            .output(item('gregtech:meta_dust_small', 25) * 2)
            .time(4000)
            .campfireRequired(true)// hahahahaha fuck you
            .name("oreproc_tetrahedrite_crushed_purified")  
            .register()

                mods.pyrotech.soaking_pot.recipeBuilder()
            .input(ore('dustBornite'))
            .fluidInput(fluid('water') * 250)
            .output(item('gregtech:meta_dust_small', 25))
            .time(2400)
            .campfireRequired(true)// hahahahaha fuck you
            .name("oreproc_bornite_crushed_purified")  
            .register()
        
                mods.pyrotech.soaking_pot.recipeBuilder()
            .input(ore('dustChalcocite'))
            .fluidInput(fluid('water') * 250)
            .output(item('gregtech:meta_dust_small', 25))
            .time(2400)
            .campfireRequired(true)// hahahahaha fuck you
            .name("oreproc_chalcocite_crushed_purified")  
            .register()
// tin


                mods.pyrotech.soaking_pot.recipeBuilder()
            .input(ore('dustCassiterite'))
            .fluidInput(fluid('water') * 250)
            .output(item('gregtech:meta_dust_small', 112) * 2)
            .time(2400)
            .campfireRequired(true)// hahahahaha fuck you
            .name("oreproc_cassiterite_crushed_purified")  
            .register()
        
                        mods.pyrotech.soaking_pot.recipeBuilder()
            .input(ore('dustCassiteriteSand'))
            .fluidInput(fluid('water') * 250)
            .output(item('gregtech:meta_dust_small', 112) * 2)
            .time(2400)
            .campfireRequired(true)// hahahahaha fuck you
            .name("oreproc_cassiterite_crushed_purified")  
            .register()

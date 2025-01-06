

recipemap('assembler').recipeBuilder()
        .inputs(ore('wireFineAluminium') * 3)
        .inputs(ore('plateSteel'))
        .inputs(ore('paneGlass'))
        .outputs(item('hbm:fuse'))
        .duration(120).EUt(4).buildAndRegister()


recipemap('assembler').recipeBuilder()
        .inputs(ore('wireFineCupronickel') * 3)
        .inputs(ore('wireFineAluminium') * 2)
        .inputs(ore('plateCopper'))
        .inputs(ore('dustQuartz'))
        .outputs(item('hbm:thermo_element'))
        .duration(40).EUt(4).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('gregtech:machine', 1625))
        .inputs(ore('dustLithium') * 16)
        .outputs(item('hbm:part_lithium') * 4)
        .duration(120).EUt(8).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('gregtech:machine', 1625))
        .inputs(ore('dustCarbon') * 16)
        .outputs(item('hbm:part_carbon') * 4)
        .duration(120).EUt(8).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('gregtech:machine', 1625))
        .inputs(ore('dustBeryllium') * 16)
        .outputs(item('hbm:part_beryllium') * 4)
        .duration(120).EUt(8).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('gregtech:machine', 1625))
        .inputs(ore('dustCopper') * 16)
        .outputs(item('hbm:part_copper') * 4)
        .duration(120).EUt(8).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('gregtech:machine', 1625))
        .inputs(ore('dustPlutonium') * 16)
        .outputs(item('hbm:part_plutonium') * 4)
        .duration(120).EUt(8).buildAndRegister()
        

// machine tiem!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// lets
recipemap('assembler').recipeBuilder()
        .inputs(item('gregtech:meta_turbine_blade', 113) * 7)
        .inputs(ore('stickStainlessSteel') * 2)
        .inputs(ore('screwTitanium') * 14)
        .outputs(item('hbm:turbine_titanium'))
        .duration(1240).EUt(16).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('gregtech:meta_item_1', 711).withNbt(['GT.PartStats': ['Material': 'gregtech:ultimet']]))
        .inputs(ore('circuitMv') * 3)
        .inputs(ore('plateSteel') * 32)
        .inputs(ore('stickLongStainlessSteel') * 3)
        .inputs(item('gregtech:wire_coil') * 16)
        .outputs(item('hbm:machine_large_turbine'))
        .duration(2920).EUt(128).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 64)
        .inputs(ore('plateBlackSteel') * 64)
        .inputs(ore('plateStainlesSteel') * 64)
        .inputs(ore('circuitHv') * 3)
        .inputs(ore('stickLongStainlessSteel') * 3)
        .inputs(item('gregtech:wire_coil', 1) * 16)
        .inputs(item('hbm:turbine_tungsten') * 2)
        .outputs(item('hbm:machine_turbofan'))
        .duration(16384).EUt(510).buildAndRegister()

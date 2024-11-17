

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
        
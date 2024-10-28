recipemap('mixer').recipeBuilder()
        .inputs(ore('dustBlackSteel') * 2)
        .inputs(ore('dustEndStone'))
        .inputs(ore('dustAluminium') * 2)
        .outputs(item('gregtech:meta_dust', 31020)
        .duration(340).EUt(510).buildAndRegister()
                 
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustStone') * 2)
        .fluidInputs(fluid('endogeniccoat') * 100)
        .outputs(item('gregtech:meta_dust', 31021)
        .duration(340).EUt(510).buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustStone') * 2)
        .fluidInputs(fluid('endogeniccoat') * 100)
       .fluidInputs(fluid('chorus') * 100)
        .outputs(item('gregtech:meta_dust', 31021)
        .duration(80).EUt(128).buildAndRegister()

                 
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustEnderPearl') * 9)
        .fluidInputs(fluid('distilled_water') * 144)
        .inputs(ore('dustAluminium') * 3)
        .fluidOutputs(fluid('endogeniccoat')
        .duration(80).EUt(12).buildAndRegister()

          
                 
// to-do- 
// Register SGS, Chorus Fluid, End Stone Dust, Fix Starlight val, Endogenic Coat)

// Enezneb Catalyst Preparation
recipemap('large_chemical_reactor').recipeBuilder()
    .inputs(ore('dustPlatinumGroupSludge') * 4)
    .fluidInputs(fluid('methanol') * 2000, fluid('oxygen') * 1000)
    .outputs(item('gregtech:meta_dust', 30029)) // Enezneb Catalyst Dust
    .duration(2400).EUt(16384).buildAndRegister();

// Enezneb Synthesis
recipemap('large_chemical_reactor').recipeBuilder()
    .inputs(ore('dustEneznebCatalyst') * 2)
    .fluidInputs(fluid('nitrobenzene') * 1000, fluid('ammonia') * 2000)
    .fluidOutputs(fluid('enezneb') * 2000)
    .outputs(metaitem("dustSpentCatalystDust"))
    .duration(3600).EUt(24576).buildAndRegister();

// Recycling Enezneb Components
recipemap('large_chemical_reactor').recipeBuilder()
    .inputs(ore('dustSpentCatalyst') * 4)
    .fluidInputs(fluid('ammonia') * 2000)
    .outputs(item('gregtech:meta_dust', 30033), item('gregtech:meta_dust', 30010)) 
    .fluidOutputs(fluid('enezneb') * 1000)
    .duration(3600).EUt(20480).buildAndRegister();

    recipemap('gas_turbine').recipeBuilder()
    .fluidInputs(fluid('enezneb'))
    .duration(40).EUt(48).buildAndRegister();
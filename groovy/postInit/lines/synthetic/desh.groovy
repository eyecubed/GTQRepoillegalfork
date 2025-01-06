
recipemap('mixer').recipeBuilder()
    .inputs(ore('dustChrome') * 2, ore('dustCopper') * 4, ore('dustTin') * 2)
    .outputs(metaitem('dustDeshAlloy')) // Desh PEANITS
    .duration(400).EUt(120).buildAndRegister();

recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('ingotDeshAlloy'))
    .inputs(ore('dustDeshCatalyst'))
    .fluidInputs(fluid('oxygen') * 1000, fluid('hydrogen') * 500)
    .outputs(item('gregtech:meta_ingot', 32125), metaitem('dustSpentCatalystBeta'))
    .duration(600).EUt(240).buildAndRegister();
    
recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('dustSpentCatalystBeta'))
    .fluidInputs(fluid('sulfuric_acid') * 1000)
    .outputs(metaitem('dustChrome') * 1, metaitem('dustTin') * 2)
    .fluidOutputs(fluid('diluted_sulfuric_acid') * 1000)
    .duration(800).EUt(510).buildAndRegister();

recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('ingotDeshAlloy'), ore('dustRareEarth') * 2)
    .fluidInputs(fluid('nitrogen') * 500)
    .outputs(metaitem('dustDesh'))
    .duration(800).EUt(510).buildAndRegister();

recipemap('mixer').recipeBuilder()
    .inputs(ore('dustChromium'), ore('dustRareEarth') * 2)
    .fluidInputs(fluid('mercury') * 144)
    .outputs(metaitem('dustDeshCatalyst')) 
    .duration(800).EUt(510).buildAndRegister();
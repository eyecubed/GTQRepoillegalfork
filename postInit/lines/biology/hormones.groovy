recipemap('large_chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('cholesterol') * 100)
    .fluidInputs(fluid('oxygen') * 1000)
    .fluidOutputs(fluid('androstenedione') * 1000)
    .duration(1200).EUt(8192).buildAndRegister();

// Testosterone Production
recipemap('chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('androstenedione') * 1000)
    .fluidInputs(fluid('hydrogen') * 500)
    .fluidOutputs(fluid('testosterone') * 1000)
    .duration(800).EUt(6144).buildAndRegister();

// Estrogen Diversion
recipemap('large_chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('androstenedione') * 500)
    .fluidInputs(fluid('water') * 500)
    .fluidOutputs(fluid('estrogen') * 500)
    .duration(600).EUt(4096).buildAndRegister();

// Estradiol Conversion
recipemap('chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('estrogen') * 1000)
    .fluidInputs(fluid('hydrogen') * 500)
    .fluidOutputs(fluid('estradiol') * 1000)
    .duration(700).EUt(5120).buildAndRegister();

// Estrone Synthesis
recipemap('large_chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('estrogen') * 1000)
    .fluidInputs(fluid('oxygen') * 500)
    .fluidOutputs(fluid('estrone') * 1000)
    .duration(800).EUt(6144).buildAndRegister();

// Recycling Process
recipemap('large_chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('estradiol') * 500)
    .fluidInputs(fluid('oxygen') * 500)
    .fluidOutputs(fluid('androstenedione') * 250)
    .fluidOutputs(fluid('water') * 250)
    .duration(900).EUt(1024).buildAndRegister();
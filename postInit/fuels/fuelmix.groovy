
recipemap('mixer').recipeBuilder()
        .fluidInputs(fluid('nitro_fuel') * 100)
        .inputs(item('hbm:powder_nitan_mix'))
        .fluidOutputs(fluid('nitanrocketfuel') * 100)
        .duration(900).EUt(220).buildAndRegister()
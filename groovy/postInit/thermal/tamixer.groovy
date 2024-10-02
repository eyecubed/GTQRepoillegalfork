
recipemap('mixer').recipeBuilder()
        .inputs(ore('dustSchrabidium'))
        .inputs(ore('dustRedstone') * 4)
        .inputs(ore('dustEnergeticAlloy') * 4)
        .inputs(ore('dustCarbon') * 4)
        .fluidInputs(fluid('steel') * 277 )
        .outputs(item('gregtech:meta_dust', 32131))
        .duration(900).EUt(220).buildAndRegister()


recipemap('mixer').recipeBuilder()
        .inputs(ore('dustSilicon'))
        .inputs(ore('dustRedstone') * 4)
        .inputs(ore('dustRedstone') * 4)
        .outputs(item('gregtech:meta_dust', 32145))
        .duration(220).EUt(32).buildAndRegister()

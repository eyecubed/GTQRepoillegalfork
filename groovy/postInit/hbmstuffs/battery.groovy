
recipemap('canner').recipeBuilder()
        .inputs(item('gregtech:meta_item_1', 717))
        .inputs(ore('dustRedstone') * 2)
        .outputs(item('hbm:battery_generic'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_generic'))
        .inputs(ore('dustLithium') * 2)
        .outputs(item('hbm:battery_lithium'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_generic') * 3)
        .inputs(ore('dustRedstoneAlloy') * 2)
        .outputs(item('hbm:battery_red_cell'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_red_cell') * 6)
        .inputs(ore('dustRedstoneAlloy') * 2)
        .outputs(item('hbm:battery_red_cell_6'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_red_cell') * 6)
        .inputs(ore('dustElectricalSteel') * 2)
        .outputs(item('hbm:battery_red_cell_6'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_red_cell_6') * 4)
        .inputs(ore('dustEnergeticAlloy') * 2)
        .outputs(item('hbm:battery_red_cell_24'))
        .duration(120).EUt(2).buildAndRegister()


recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_red_cell_6') * 4)
        .inputs(ore('dustEnergeticAlloy') * 2)
        .outputs(item('hbm:battery_red_cell_24'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_generic'))
        .inputs(ore('dustDesh') * 2)
        .outputs(item('hbm:battery_advanced'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_advanced') * 3)
        .inputs(ore('dustDesh') * 6)
        .outputs(item('hbm:battery_advanced_cell'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_advanced_cell') * 4)
        .inputs(ore('dustDesh') * 8)
        .outputs(item('hbm:battery_advanced_cell_4'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_advanced_cell_4') * 3)
        .outputs(item('hbm:battery_advanced_cell_12'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_lithium') * 3)
        .inputs(ore('dustLithium') * 6)
        .outputs(item('hbm:battery_lithium_cell'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('hbm:battery_lithium_cell') * 3)
        .inputs(ore('dustLithium') * 12)
        .outputs(item('hbm:battery_lithium_cell_3'))
        .duration(120).EUt(2).buildAndRegister()

// the great void of 2024

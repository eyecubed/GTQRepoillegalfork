// cabels
// 
recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('steel') * 144)
        .inputs(ore('wireFineCopper') * 3)
        .outputs(item('immersiveengineering:wirecoil') * 4)
        .duration(120).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('space_grade_steel') * 144)
        .inputs(ore('wireGtSingleHydrolysedFluix') * 3)
        .outputs(item('immersivecables:wire_coil') * 4)
        .duration(120).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('electrical_steel') * 72)
        .inputs(ore('gemFlawlessFluix'))
        .inputs(item('immersivecables:wire_coil') * 2)
        .outputs(item('immersivecables:wire_coil', 1))
        .duration(120).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('electrical_steel') * 144)
        .inputs(item('immersivecables:wire_coil') * 4)
        .outputs(item('immersivecables:wire_coil', 1))
        .duration(120).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('electrical_steel') * 144)
        .inputs(item('immersivecables:wire_coil') * 4)
        .outputs(item('immersivecables:wire_coil', 1))
        .duration(120).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('electrical_steel') * 144)
        .inputs(item('immersivecables:wire_coil') * 4)
        .outputs(item('immersivecables:wire_coil', 1))
        .duration(120).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('steel') * 144)
        .inputs(ore('gemFlawlessNetherQuartz'))
        .outputs(item('immersivecables:wire_coil', 2) * 2)
        .duration(120).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('steel') * 144)
        .inputs(ore('gemFlawlessCertusQuartz'))
        .outputs(item('immersivecables:wire_coil', 2) * 4)
        .duration(120).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('steel') * 144)
        .inputs(ore('gemFlawlessCertusQuartz'))
        .outputs(item('immersivecables:wire_coil', 2) * 4)
        .duration(120).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('red_alloy') * 288)
        .inputs(ore('stickRedstoneAlloy'))
        .outputs(item('immersiveengineering:wirecoil', 5) * 4)
        .duration(40).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('black_steel') * 144)
        .inputs(ore('wireFineElectrum') * 3)
        .outputs(item('immersiveengineering:wirecoil', 1) * 4)
        .duration(120).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('black_steel') * 144)
        .inputs(ore('wireFineSteel'))
        .inputs(ore('wireFineAluminium'))
        .inputs(ore('wireFineAdvancedAlloy'))
        .outputs(item('immersiveengineering:wirecoil', 2) * 4)
        .duration(120).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('glue') * 72)
        .inputs(ore('fiberHemp'))
        .inputs(ore('stickTreatedWood'))
        .outputs(item('immersiveengineering:wirecoil', 3) * 16)
        .duration(120).EUt(30).buildAndRegister()


// stuffings!

crafting.removeByInput(item('immersiveengineering:tool'))


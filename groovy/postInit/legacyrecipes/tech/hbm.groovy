// MV (all of them)

import gregtech.api.metatileentity.multiblock.CleanroomType

// Chemical reactor recipe for kerosene
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustSulfur') * 6)
        .fluidInputs(fluid('steam') * 500 )
        .fluidInputs(fluid('diesel') * 120 )
        .fluidOutputs(fluid('kerosene') * 240 )
        .duration(400).EUt(120).buildAndRegister()

// Chemical reactor recipe for HBM red copper ingot
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustRedstone') * 8)
        .inputs(ore('ingotCopper') * 16)
        .fluidInputs(fluid('oxygen') * 120 )
        .fluidInputs(fluid('nitrogen') * 120 )
        .outputs(item('hbm:ingot_red_copper') * 4)
        .duration(400).EUt(120).buildAndRegister()

// Chemical reactor recipe for HBM advanced alloy ingot
recipemap('chemical_reactor').recipeBuilder()
        .inputs(item('hbm:ingot_red_copper') * 8)
        .inputs(ore('ingotSteel') * 16)
        .fluidInputs(fluid('oxygen') * 120 )
        .fluidInputs(fluid('nitrogen') * 120 )
        .outputs(item('hbm:ingot_advanced_alloy') * 4)
        .duration(600).EUt(120).buildAndRegister()

// Assembler recipe for HBM generic small warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('gregtech:meta_item_1', 498) * 2)
        .inputs(ore('plateDenseAluminium') * 2)
        .inputs(ore('plateSteel') * 2)
        .fluidInputs(fluid('steel') * 120)
        .outputs(item('hbm:warhead_generic_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM launch pad
recipemap('assembler').recipeBuilder()
        .inputs(ore('wireFineAluminium') * 2)
        .inputs(ore('frameGtBlackSteel') * 12)
        .inputs(ore('plateSteel') * 24)
        .inputs(ore('circuitMv') * 4)
        .inputs(ore('componentDiode') * 4)
        .fluidInputs(fluid('steel') * 500)
        .outputs(item('hbm:launch_pad'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small thruster
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 12)
        .inputs(item('gregtech:meta_item_1', 81))
        .inputs(ore('componentResistor') * 1)
        .inputs(ore('componentDiode') * 4)
        .fluidInputs(fluid('steel') * 200)
        .outputs(item('hbm:thruster_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small fuel tank
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 12)
        .inputs(item('gregtech:meta_item_1', 81))
        .fluidInputs(fluid('steel') * 200)
        .outputs(item('hbm:fuel_tank_small') * 2)
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small incendiary warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(ore('plateDenseAluminium') * 2)
        .inputs(ore('dustRedPhosphorus') * 2)
        .fluidInputs(fluid('toluene') * 120)
        .outputs(item('hbm:warhead_incendiary_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small cluster warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:pellet_cluster') * 2)
        .fluidInputs(fluid('steel') * 120)
        .outputs(item('hbm:warhead_cluster_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM cluster pellet
recipemap('assembler').recipeBuilder()
        .inputs(item('minecraft:tnt'))
        .inputs(ore('plateSteel') * 2)
        .fluidInputs(fluid('steel') * 120)
        .outputs(item('hbm:pellet_cluster') * 8)
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small buster warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:det_cord') * 8)
        .fluidInputs(fluid('aluminium') * 120)
        .outputs(item('hbm:warhead_buster_small'))
        .duration(200).EUt(120).buildAndRegister()

// Cutter recipe for HBM red copper wire
recipemap('cutter').recipeBuilder()
        .inputs(item('hbm:ingot_red_copper'))
        .fluidInputs(fluid('lubricant') * 122 )
        .outputs(item('hbm:wire_red_copper') * 8)
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(450).EUt(120).buildAndRegister()

// Assembler recipe for HBM aluminum circuit
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateAluminium') * 2)
        .inputs(item('hbm:circuit_raw') * 4)
        .inputs(ore('wireFineAluminium') * 4)
        .inputs(item('gregtech:meta_item_1', 521))
        .fluidInputs(fluid('tin') * 120)
        .outputs(item('hbm:circuit_aluminium') * 2)
        .duration(200).EUt(120).buildAndRegister()

// MV.
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateAluminium') * 2)
        .inputs(ore('wireFineCopper') * 4)
        .inputs(item('gregtech:meta_item_1', 521))
        .inputs(item('hbm:circuit_aluminium') * 2)
        .fluidInputs(fluid('tin') * 120)
        .outputs(item('hbm:circuit_copper') * 2)
        .duration(200).EUt(120).buildAndRegister()
// MV Red Phosphourous Recipe.
recipemap('chemical_reactor').recipeBuilder()
         .inputs(ore('dustTin'))
         .inputs(item('twilightforest:fiery_tears'))
         .outputs(item('hbm:powder_fire') * 32)
         .duration(200).EUt(120).buildAndRegister()


// Centrifuge recipe for extracting mercury from redstone ore, 5% chance increases 10 by tier.
// LV.
recipemap('centrifuge').recipeBuilder()
        .inputs(ore('oreRedstone') * 2)
        .chancedOutput(item('hbm:nugget_mercury'), 500, 1000)
        .duration(200).EUt(32).buildAndRegister()
// EBF-Related Recipes

// MV
recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustCobalt') * 6)
        .inputs(ore('ingotSteel') * 6)
        .fluidInputs(fluid('oxygen') * 250 )
        .outputs(item('hbm:ingot_dura_steel') * 2)
        .property("temperature", 1200)
        .duration(400).EUt(140).buildAndRegister()

// AltRecipe for HBM HSS, HV.
recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustGraphene') * 2)
        .inputs(ore('ingotSteel') * 6)
        .fluidInputs(fluid('tungsten') * 250 )
        .outputs(item('hbm:ingot_dura_steel') * 2)
        .property("temperature", 2700)
        .duration(400).EUt(470).buildAndRegister()

recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustSteel') * 2)
        .inputs(ore('dustRedPhosphorous') * 6)
        .fluidInputs(fluid('mercury') * 250 )
        .outputs(item('hbm:ingot_saturnite') * 2)
        .property("temperature", 2200)
        .duration(900).EUt(470).buildAndRegister()
// Desh recipe. HV.
recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(item('hbm:powder_desh_mix') * 6)
        .fluidInputs(fluid('mercury') * 500 )
        .outputs(item('hbm:ingot_desh') * 2)
        .property("temperature", 2700)
        .duration(400).EUt(240).buildAndRegister()

// Idiot, i forgot the flroping missile comps :cry:

recipemap('assembler').recipeBuilder()
        .inputs(item('gregtech:meta_item_1', 460) * 2)
        .inputs(ore('plateDenseStainlessSteel') * 2)
        .inputs(ore('plateSteel') * 12)
        .inputs(ore('screwStainlessSteel') * 2)
        .fluidInputs(fluid('silicone_rubber') * 120)
        .outputs(item('hbm:warhead_generic_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateStainlessSteel') * 4)
        .inputs(ore('platePolyethylene') * 4)
        .inputs(ore('componentResistor') * 1)
        .inputs(ore('circuitLv') * 4)
        .fluidInputs(fluid('stainless_steel') * 200)
        .outputs(item('hbm:thruster_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateStainlessSteel') * 2)
        .inputs(ore('plateBlackSteel') * 4)
        .inputs(ore('platePolyethylene') * 4)
        .inputs(ore('componentResistor') * 1)
        .inputs(ore('circuitLv') * 4)
        .fluidInputs(fluid('stainless_steel') * 200)
        .outputs(item('hbm:fuel_tank_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(ore('plateDenseAluminium') * 2)
        .inputs(ore('dustRedPhosphorus') * 2)
        .fluidInputs(fluid('glyceryl_trinitrate') * 120)
        .outputs(item('hbm:warhead_incendiary_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:det_charge') * 4)
        .fluidInputs(fluid('stainless_steel') * 120)
        .outputs(item('hbm:warhead_buster_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:det_cord') * 2)
        .inputs(item('hbm:pellet_cluster') * 4)
        .fluidInputs(fluid('stainless_steel') * 120)
        .outputs(item('hbm:warhead_cluster_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('circuitHv'))
        .inputs(ore('wireFineAluminium') * 2)
        .fluidInputs(fluid('soldering_alloy') * 120)
        .outputs(item('hbm:circuit_red_copper'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('circuitHv'))
        .inputs(ore('wireFineElectrum') * 2)
        .fluidInputs(fluid('soldering_alloy') * 120)
        .outputs(item('hbm:circuit_gold'))
        .duration(200).EUt(500).buildAndRegister()

// fusion recipes for schrab
recipemap('fusion_reactor').recipeBuilder()
        .fluidInputs(fluid('germanium') * 250)
        .fluidInputs(fluid('plutonium') * 500 )
        .fluidOutputs(fluid('schrabidium') * 150)
        .duration(400).EUt(62000).buildAndRegister()

// Coolant.

recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustSaltpeter'))
        .inputs(ore('rodBlizz') * 4)
        .fluidInputs(fluid('distilled_water') * 120 )
        .fluidInputs(fluid('water') * 120 )
        .fluidOutputs(fluid('coolant') * 40 )
        .duration(400).EUt(510).buildAndRegister()

// cursed IC recipe for schrab
recipemap('implosion_compressor').recipeBuilder()
        .inputs(ore('dustUranium') * 24)
        .inputs(ore('dustSteel') * 2)
        .outputs(item('hbm:nugget_schrabidium'))
        .property("explosives", item('hbm:missile_generic'))
        .duration(400).EUt(120).buildAndRegister()

recipemap('forge_hammer').recipeBuilder()
         .inputs(ore('ingotAdvancedAlloy') * 2)
         .outputs(item('hbm:plate_advanced_alloy'))
         .duration(200).EUt(120).buildAndRegister()

// H202, why does greg not have this>??!?!?!?

recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(fluid('hydrogen') * 200 )
        .fluidInputs(fluid('oxygen') * 200 )
        .fluidOutputs(fluid('acid') * 300 )
        .duration(400).EUt(32).buildAndRegister()


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
        

// machine tiem!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// lets
recipemap('assembler').recipeBuilder()
        .inputs(item('gregtech:meta_turbine_blade', 113) * 7)
        .inputs(ore('stickStainlessSteel') * 2)
        .inputs(ore('screwTitanium') * 14)
        .outputs(item('hbm:turbine_titanium'))
        .duration(1240).EUt(16).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('gregtech:meta_item_1', 711).withNbt(['GT.PartStats': ['Material': 'gregtech:ultimet']]))
        .inputs(ore('circuitMv') * 3)
        .inputs(ore('plateSteel') * 32)
        .inputs(ore('stickLongStainlessSteel') * 3)
        .inputs(item('gregtech:wire_coil') * 16)
        .outputs(item('hbm:machine_large_turbine'))
        .duration(2920).EUt(128).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 64)
        .inputs(ore('plateBlackSteel') * 64)
        .inputs(ore('plateStainlesSteel') * 64)
        .inputs(ore('circuitHv') * 3)
        .inputs(ore('stickLongStainlessSteel') * 3)
        .inputs(item('gregtech:wire_coil', 1) * 16)
        .inputs(item('hbm:turbine_tungsten') * 2)
        .outputs(item('hbm:machine_turbofan'))
        .duration(16384).EUt(510).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 64)
        .inputs(ore('plateBlackSteel') * 64)
        .inputs(ore('plateStainlesSteel') * 64)
        .inputs(item('hbm:circuit_targeting_t3') * 12)
        .inputs(item('hbm:circuit_targeting_t4') * 3)
        .inputs(item('hbm:hull_big_steel') * 16)
        .inputs(item('hbm:thruster_large') * 3)
        .outputs(item('hbm:missile_carrier'))
        .duration(1800).EUt(510).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('dustSmallGunpowder'))
        .inputs(ore('plateIron'))
        .outputs(item('hbm:primer_357') * 8)
        .duration(60).EUt(8).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('dustGunpowder'))
        .inputs(ore('plateIron'))
        .outputs(item('hbm:primer_44') * 8)
        .duration(60).EUt(8).buildAndRegister()


recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_iron'))
        .outputs(item('hbm:gun_revolver_iron_ammo'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_steel'))
        .outputs(item('hbm:gun_revolver_ammo'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_lead'))
        .outputs(item('hbm:gun_revolver_lead_ammo'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_gold'))
        .outputs(item('hbm:gun_revolver_gold_ammo'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_schrabidium'))
        .outputs(item('hbm:gun_revolver_schrabidium_ammo'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_nightmare'))
        .outputs(item('hbm:gun_revolver_nightmare_ammo'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_desh'))
        .outputs(item('hbm:ammo_357_desh'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_nopip'))
        .outputs(item('hbm:ammo_44'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_smg'))
        .outputs(item('hbm:ammo_9mm'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_556'))
        .outputs(item('hbm:ammo_556'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_uzi'))
        .outputs(item('hbm:ammo_22lr'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_actionexpress'))
        .outputs(item('hbm:ammo_50ae'))
        .duration(20).EUt(4).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_calamity'))
        .outputs(item('hbm:ammo_50bmg'))
        .duration(20).EUt(4).buildAndRegister()
        
recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:assembly_lacunae'))
        .outputs(item('hbm:ammo_5mm'))
        .duration(20).EUt(4).buildAndRegister()


recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:circuit_targeting_t1'))
        .inputs(item('hbm:hull_small_steel') * 6)
        .inputs(item('hbm:thruster_small') * 3)
        .outputs(item('hbm:missile_assembly'))
        .duration(240).EUt(120).buildAndRegister()

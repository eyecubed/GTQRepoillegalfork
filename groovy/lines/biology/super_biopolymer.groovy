// Bio Resin Production
recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('dustPlantMatter') * 4)
    .fluidInputs(fluid('water') * 1000)
    .fluidOutputs(fluid('bio_resin') * 1000)
    .duration(800).EUt(4096).buildAndRegister();

// Fiber Matrix Creation
recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('ingotAdvancedPolypeptide'))
    .fluidInputs(fluid('bio_resin') * 500)
    .outputs(item('gregtech:meta_plate', 30014))
    .duration(600).EUt(8192).buildAndRegister();

// High-Density Polymer Synthesis
recipemap('mixer').recipeBuilder()
    .inputs(ore('dustSiliconeRubber') * 6, ore('plateFiberMatrix') * 2)
    .fluidInputs(fluid('bio_resin') * 1000)
    .outputs(item('gregtech:meta_plate', 30015))
    .duration(1000).EUt(12288).buildAndRegister();

// Cross-Linked Polypeptide Creation
recipemap('assembler').recipeBuilder()
    .inputs(ore('ingotAdvancedPolypeptide'), ore('plateHighDensityPolymer'))
    .fluidInputs(fluid('methane') * 500)
    .outputs(item('gregtech:meta_ingot', 30018))
    .duration(1500).EUt(16384).buildAndRegister();

// Nanopolymer Fiber Synthesis
recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('ingotCrossLinkedPolypeptide'), ore('dustCarbonNanotube') * 2)
    .fluidInputs(fluid('bio_resin') * 1000)
    .outputs(item('gregtech:meta_plate', 30019))
    .duration(2000).EUt(20480).buildAndRegister();

// Biopolymer Composite Assembly
recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('dustNanopolymerFiber') * 2, ore('plateHighDensityPolymer'))
    .fluidInputs(fluid('liquid_helium') * 1500)
    .outputs(item('gregtech:meta_dust', 30020))
    .duration(3000).EUt(24576).buildAndRegister();

// Bio Superpolymer Mix Creation
recipemap('large_chemical_reactor').recipeBuilder()
    .inputs(ore('dustBiopolymerComposite'), ore('dustNanopolymerFiber'))
    .fluidInputs(fluid('nitrogen') * 2000)
    .fluidOutputs(fluid('bio_superpolymer_mix') * 1000)
    .duration(2400).EUt(32768).buildAndRegister();

// Bio Superpolymer Synthesis
recipemap('chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('bio_superpolymer_mix') * 1000)
    .inputs(ore('dustBiopolymerComposite') * 2, ore('ingotReinforcedPolypeptide') * 2)
    .outputs(item('gregtech:meta_ingot', 30017))
    .duration(3600).EUt(24576).buildAndRegister();

// Recycling Process: Feed Back Extra Byproducts
recipemap('large_chemical_reactor').recipeBuilder()
    .inputs(ore('ingotBioSuperpolymer'))
    .fluidInputs(fluid('bio_resin') * 500)
    .outputs(item('gregtech:meta_dust', 30010))
    .fluidOutputs(fluid('bio_superpolymer_mix') * 500)
    .duration(3000).EUt(16384).buildAndRegister();

recipemap('assembler').recipeBuilder()
    .fluidInputs(fluid('cortisol') * 250)
    .inputs(ore('plateBioSuperpolymer') * 8)
    .outputs(item('gregtech:machine_casing', 10))
    .duration(50).EUt(32).buildAndRegister();

    // Cross-Linked Polypeptide Creation
recipemap('assembler').recipeBuilder()
    .inputs(ore('ingotAdvancedPolypeptide'), ore('plateCrosslinkedPolypeptide'))
    .fluidInputs(fluid('helium') * 500)
    .outputs(metaitem('plateReinforcedPolypeptide'))
    .duration(1500).EUt(16384).buildAndRegister();

    

// New Recycling Step with Byproducts
recipemap('large_chemical_reactor').recipeBuilder()
    .inputs(ore('dustBiopolymerComposite'), ore('plateHighDensityPolymer'))
    .fluidInputs(fluid('methane') * 1000)
    .outputs(item('gregtech:meta_plate', 30014))
    .fluidOutputs(fluid('bio_resin') * 500)
    .duration(3600).EUt(18432).buildAndRegister();

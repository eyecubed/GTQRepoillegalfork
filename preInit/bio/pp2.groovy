
// listen to gregtech material event

mods.gregtech.materialEvent {
materialBuilder(30013, "bio_resin")
    .liquid(fluidBuilder())
    .color(0x1f8b4c) // Deep green
.build();

materialBuilder(30014, "fiber_matrix")
    .ingot()
    .flags("generate_plate", "generate_dense")
    .color(0x8b4513) // Dark brown
.build();

materialBuilder(30015, "high_density_polymer")
    .ingot()
        .polymer()
            .flags("generate_plate", "generate_dense")
    .color(0xffcc00) // Bright yellow
.build();

materialBuilder(30016, "reinforced_polypeptide")
    .ingot()
        .polymer()
            .flags("generate_plate", "generate_dense")
    .color(0x404040) // Dark gray
.build();

materialBuilder(30017, "bio_superpolymer")
    .ingot()
    .polymer()
    .flags("generate_plate", "generate_dense")
    .color(0x000080) // Navy blue
.build();

materialBuilder(30018, "cross_linked_polypeptide")
    .ingot()
        .polymer()
            .flags("generate_plate", "generate_dense")
    .color(0x008080) // Teal
.build();

materialBuilder(30019, "nanopolymer_fiber")
    .ingot()
        .polymer()
            .flags("generate_plate", "generate_dense")
    .color(0x808000) // Olive
.build();

materialBuilder(30020, "biopolymer_composite")
    .ingot()
    .color(0x800080) // Purple
.build();

materialBuilder(30021, "bio_superpolymer_mix")
    .liquid(fluidBuilder())
    .color(0x004080) // Deep blue
.build();

materialBuilder(30022, "recycled_polypeptide")
    .dust()
    
    .color(0x505050) // Medium gray
.build();

materialBuilder(30023, "plant_matter")
    .dust()
    .color(0x800080) // Medium gray
.build();

}

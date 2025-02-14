
// listen to gregtech material event

mods.gregtech.materialEvent {
    materialBuilder(32140, 'highly_impure_fluix_slurry')
        .liquid(fluidBuilder())
        .color(0x5400a3)
.build()

    materialBuilder(32143, 'pure_fluix_slurry')
        .liquid(fluidBuilder())
        .color(0x6f2ab0)
.build()

    materialBuilder(32144, 'redstone_reactant')
        .liquid(fluidBuilder())
        .color(0x6f2ab0)
        .components(material('lithium'), material('redstone'))
.build()

    materialBuilder(32150, 'thermally_expanded_redstone_solution')
        .liquid(fluidBuilder())
        .color(0xad0000)
.build()

    materialBuilder(31999, 'endogenic_coat')
        .liquid(fluidBuilder())
        .color(0x2200c9)
.build()

    materialBuilder(31699, 'fluix_soldering_alloy')
        .liquid(fluidBuilder())
        .color(0x6f2ab0)
.build()
// Cholesterol
materialBuilder(30000, "cholesterol")
    .liquid(fluidBuilder())
    .color(0x7a0008) // Dark red-brown color
.build();

// Pregnenolone
materialBuilder(30001, "pregnenolone")
    .liquid(fluidBuilder())
    .color(0xffcc00) // Golden yellow
.build();

// 17α-Hydroxypregnenolone
materialBuilder(30002, "seventeena_hydroxypregnenolone")
    .liquid(fluidBuilder())
    .color(0xffe066) // Pale yellow
.build();

// 17α-Hydroxyprogesterone
materialBuilder(30003, "seventeena_hydroxyprogesterone")
    .liquid(fluidBuilder())
    .color(0xffb732) // Amber
.build();

// 11-Deoxycortisol
materialBuilder(30004, "elevendeoxycortisol")
    .liquid(fluidBuilder())
    .color(0xc39bd3) // Soft purple
.build();

// Cortisol
materialBuilder(30005, "cortisol")
    .liquid(fluidBuilder())
    .color(0x8e44ad) // Deep purple
.build();

// Biochemistry Line: Amino Acids and Polypeptide Synthesis

// Material Definitions
materialBuilder(30009, "glycine")
    .dust()
    .color(0xa0d6a0) // Pale green
.build();

materialBuilder(30010, "alanine")
    .dust()
    .color(0xa080d6) // Lavender
.build();

materialBuilder(30011, "serine")
    .dust()
    .color(0xd6a080) // Peach
.build();

materialBuilder(30012, "advanced_polypeptide")
    .ingot()
    .polymer()
    .flags("generate_plate")
    .color(0x606060) // Gray
.build();

materialBuilder(30024, "androstenedione")
    .liquid(fluidBuilder())
    .color(0xb87333) // Copper-like
.build();

materialBuilder(30028, "testosterone")
    .liquid(fluidBuilder())
    .color(0xffd700) // Gold-like
.build();

materialBuilder(30025, "estrogen")
    .liquid(fluidBuilder())
    .color(0xff69b4) // Pink
.build();

materialBuilder(30026, "estradiol")
    .liquid(fluidBuilder())
    .color(0xffa07a) // Light salmon
.build();

materialBuilder(30027, "estrone")
    .liquid(fluidBuilder())
    .color(0xffc0cb) //
    .build();
}

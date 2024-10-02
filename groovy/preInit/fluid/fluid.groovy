
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
}


// listen to gregtech material event
mods.gregtech.materialEvent {
materialBuilder(31000, 'starmetal')
    .ingot().fluid()
    .blastTemp(2001, "MID")
    .components(material('schrabidium'), material('stellite_100'), material('signalum'))
    .color(0xA6A3D8).iconSet('SHINY')
    .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring')
.build()

materialBuilder(31001, 'c_m_b_steel')
    .ingot().fluid()
    .blastTemp(2001, "MID")
    .components(material('schrabidium'), material('redstone'), material('signalum'))
    .color(0x001E4D).iconSet('SHINY')
    .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring')
.build()

materialBuilder(31002, 'euphemium')
    .ingot().fluid()
    .blastTemp(2001, "MID")
    .components(material('osmiridium'), material('redstone'), material('signalum'))
    .color(0xF73FFF).iconSet('SHINY')
    .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring')
.build()

materialBuilder(31003, 'saturnite')
    .ingot().fluid()
    .blastTemp(2001, "MID")
    .components(material('osmiridium'), material('redstone'), material('signalum'))
    .color(0x217E89).iconSet('SHINY')
    .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring')
.build()

materialBuilder(31010, 'fluixresidue')
    .dust()
    .colorAverage()
    .components(material('fluix'), material('quartzite'))
.build()

materialBuilder(31011, 'iron_compressed')
    .ingot().fluid()
    .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring', "generate_ring", "generate_bolt_screw", "generate_round")
    .colorAverage()
    .blastTemp(1920, "MID")
    .components(material('iron'), material('iron'))
.build()

}

// for things that dont have compat
// bloomery
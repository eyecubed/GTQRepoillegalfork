
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

materialBuilder(31021, 'end_stone')
    .dust()
    .components(material('ender_pearl'), material('stone'))
.build()

materialBuilder(31013, 'endogenic_coating')
        .liquid(fluidBuilder())
        .colorAverage()
        .components(material('ender_pearl'), material('aluminium'))
        .build()
    
materialBuilder(31014, 'chorus')
        .liquid(fluidBuilder())
        .color(0xc4a5c3)
        .components(material('ender_pearl'), material('aluminium'))
        .build()

materialBuilder(31020, 'space_grade_steel')
    .ingot().fluid()
    .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring', "generate_ring", "generate_bolt_screw", "generate_round")
    .colorAverage()
    .blastTemp(1920, "MID")
    .components(material('end_stone'), material('black_steel'), material('aluminium'))
.build()

materialBuilder(31300, 'radioactive_clay')
    .dust()
        .flags()
    .colorAverage()
    .components(material('clay'), material('stone'), material('plutonium'))
.build()

materialBuilder(31301, 'insentient_polymer_clay')
    .liquid(fluidBuilder())
    .flags()
    .colorAverage()
    .components(material('clay'), material('stone'), material('plutonium'), material('ender_pearl'))
.build()

materialBuilder(31700, 'mithglar')
    .ingot().fluid()
    .color(0xAB8C5E).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(256, 1, 0, true)
    .element("Mithglar")
.build();

materialBuilder(31701, 'skadiite')
    .ingot().fluid()
    .color(0x3A4B6E).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(128, 2, 0, true)
    .element("Skadiite")
.build();

materialBuilder(31702, 'geldrun')
    .ingot().fluid()
    .color(0xFFD700).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(512, 1, 1, true)
    .element("Geldrun")
.build();

materialBuilder(31703, 'vidium')
    .ingot().fluid()
    .color(0x4F8A10).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(256, 1, 0, true)
    .element("Vidium")
.build();

materialBuilder(31704, 'freyrite')
    .ingot().fluid()
    .color(0x6E0F0F).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(128, 2, 0, true)
    .element("Freyrite")
.build();

materialBuilder(31705, 'swartim')
    .ingot().fluid()
    .color(0x2F4F4F).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(128, 1, 0, true)
    .element("Swartim")
.build();

materialBuilder(31706, 'trimla')
    .ingot().fluid()
    .color(0x7A4B3B).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(256, 1, 0, true)
    .element("Trimla")
.build();

materialBuilder(31707, 'rodanil')
    .ingot().fluid()
    .color(0x7C7A7A).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(512, 1, 1, true)
    .element("Rodanil")
.build();

materialBuilder(31708, 'drustins')
    .ingot().fluid()
    .color(0x3E9B77).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(64, 1, 0, true)
    .element("Drustins")
.build();

materialBuilder(31709, 'dowmandir')
    .ingot().fluid()
    .color(0x5F4B3C).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(128, 1, 0, true)
    .element("Dowmandir")
.build();

materialBuilder(31710, 'breytir')
    .ingot().fluid()
    .color(0xBA5A31).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(256, 1, 0, true)
    .element("Breytir")
.build();

materialBuilder(31711, 'geadris')
    .ingot().fluid()
    .color(0x9E3D3D).iconSet('METALLIC')
    .flags('generate_plate', 'generate_rod', 'generate_frame')
    .cableProperties(512, 1, 1, true)
    .element("Geadris")
.build();

materialBuilder(31750, 'hydrolysed_fluix')
    .gem()
    .colorAverage().iconSet('CERTUS')
    .cableProperties(512, 1, 1, true)
    .components(material('water'), material('fluix'))
.build();

materialBuilder(31751, 'rootmetal')
    .ingot().fluid()
    .rotorStats(110, 90, 125000)
    .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring', "generate_ring", "generate_bolt_screw", "generate_round")
    .color(0x028500)
    .components(material('iron'), material('rare_earth'))
.build()

materialBuilder(31752, 'dawnstone')
    .ingot().fluid()
    .rotorStats(400, 120, 400000)
    .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring', "generate_ring", "generate_bolt_screw", "generate_round")
    .color(0xffe650)
    .components(material('copper'), material('gold'), material('mithlgar'))
.build()

}

// for things that dont have compat
// bloomery
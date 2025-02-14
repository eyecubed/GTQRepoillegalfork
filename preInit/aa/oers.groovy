
// listen to gregtech material event

mods.gregtech.materialEvent {
materialBuilder(30700, "black_quartz")
    .flags()
    .gem(2)
    .color(0x000000)
    .iconSet('QUARTZ')
    .components(material("quartz"), material("silicon"), material("carbon"))
    .ore()
.build();

materialBuilder(30701, "phosphorite")
    .colorAverage()
    .iconSet('QUARTZ')
    .components(material("red_phosphorus") * 9, material("phosphorus"), material("quartz"))
    .ore(true)
.build();
}

// die in a fire
// ghughughughughughgghughghgu
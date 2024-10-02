
// listen to gregtech material event

mods.gregtech.materialEvent {

 materialBuilder(32160,'demetarite')
    .color(0xb0f542)
    .ore()
    .flags()
    .components(material('caesium'), material('germanium'))
    .separatedInto(material('vanadium'), material('gallium'), material('gallium'), material('demetarium'))
.build()
}
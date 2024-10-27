
// listen to gregtech material event

mods.gregtech.materialEvent {

 materialBuilder(32160,'demetarite')
    .color(0xb0f542)
    .ore()
    .flags()
    .components(material('caesium'), material('germanium'))
    .separatedInto(material('gallium'), material('demetarium'))
.build()

 materialBuilder(31900,'aridium')
    .colorAverage()
    .ore()
    .flags()
    .separatedInto(material('vibranium'), material('schrabidium'))
.build()

}

// listen to gregtech material event
mods.gregtech.materialEvent {

materialBuilder(31763, "kimberlite")
    .ore(true)
    .dust()
    .components(material('diamond'), material('olivine'), material('mica'))
    .color(0x708238) 
        .addOreByproducts(material('diamond'), material('olivine'), material('mica'))

.build();

materialBuilder(31764, "laterite")
    .ore(true)
    .dust()
    .components(material('nickel'), material('cobalt'), material('iron'))
    .color(0xD2691E)
    .addOreByproducts(material('nickel'), material('cobalt'), material('iron'))
.build();

materialBuilder(31765, "chromitite")
    .ore(true)
    .dust()
    .components(material('chrome'), material('iron'), material('platinum'))
    .color(0x8B4513)
    .addOreByproducts(material('chrome'), material('iron'), material('platinum'))
.build();

materialBuilder(31766, "carbonatite")
    .ore(true)
    .dust()
    .components(material('rare_earth'), material('carbon'), material('niobium'))
    .color(0xA9A9A9)
    .addOreByproducts(material('rare_earth'), material('coal'), material('niobium'))
.build();

materialBuilder(31767, "pegmatite")
    .ore(true)
    .dust()
    .components(material('lithium'), material('beryllium'), material('tantalum'))
    .color(0xF5DEB3)
    .addOreByproducts(material('lithium'), material('beryllium'), material('tantalum'))
.build();

materialBuilder(31770, "ferromanganese_crust")
    .ore(true)
    .dust()
    .components(material('manganese'), material('cobalt'), material('rare_earth'))
    .color(0xB8860B)
    .addOreByproducts(material('manganese'), material('cobalt'), material('rare_earth'))
.build();

}

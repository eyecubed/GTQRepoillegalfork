
// listen to gregtech material event

mods.gregtech.materialEvent {
materialBuilder(30033, "spent_catalyst_dust")
    .dust()
    .color(0x808080) // Neutral gray
    .components(material("platinum"))
.build();

materialBuilder(30030, "enezneb")
    .liquid(fluidBuilder())
    .color(0xff4500) // Bright orange for high-energy fuel
.build();

materialBuilder(30031, "enezneb_mix")
    .liquid(fluidBuilder())
    .color(0xff6347) // Tomato red for intermediate mix
.build();

materialBuilder(30032, "stabilized_enezneb")
    .liquid(fluidBuilder())
    .color(0xff7f50) // Coral orange for stabilized fuel
.build();

materialBuilder(30029, "enezneb_catalyst")
    .dust()
    .color(0xc0c0c0) // Silver for the catalyst
.build();

}

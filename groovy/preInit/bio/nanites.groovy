// listen to gregtech material event

mods.gregtech.materialEvent {
materialBuilder(30333, "assimilated_scraps")
    .dust().fluid()
    .element("Assimilation")
    .color(0xff6347)
.build();

materialBuilder(30339, "contained_hive_field")
    .liquid(fluidBuilder())
    .color(0xff4500) 
.build();

materialBuilder(30340, "laponergium_solution")
    .liquid(fluidBuilder())
    .components(material('ruby') * 5, material('redstone') * 4, material('lapotron'))
    .colorAverage() 
.build();

materialBuilder(30348, "lossless_superconductive_field")
    .liquid(fluidBuilder())
    .components(material("laponergium_solution"), material('yttrium'))
    .colorAverage() 

.build();

materialBuilder(30335, "nanite_shells")
    .liquid(fluidBuilder())
    .color(0x808080) 
.build();

materialBuilder(30336, "organic_nanite_shells")
    .liquid(fluidBuilder())
    .color(0x808080) 
.build();

materialBuilder(30337, "sentient_nanites")
    .liquid(fluidBuilder())
    .colorAverage() 
 
.build();

materialBuilder(30341, "irritated_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30342, "electrified_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30343, "tortured_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30344, "gourmet_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30345, "poisoned_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30346, "scorching_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30347, "infernal_lava")
    .liquid(fluidBuilder())
    .components(material("blaze"))
    .colorAverage() 
.build();

}
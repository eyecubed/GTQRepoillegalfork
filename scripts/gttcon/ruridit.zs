#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("ruridit");
testMat.color = 0x6bbf7f;
testMat.liquid = <liquid:ruridit>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_ingot:310>);
testMat.representativeItem = <item:gregtech:meta_ingot:310>;
testMat.addHeadMaterialStats(1920, 10.2f, 12.5f, 6);

testMat.addMaterialTrait("sharp");

testMat.itemLocalizer = function(thisMaterial, itemName){return "Ruridit " + itemName;};
testMat.localizedName = "Ruridit";
testMat.register();
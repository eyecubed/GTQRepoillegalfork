#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("blue_steel");
testMat.color = 0x64648c;
testMat.liquid = <liquid:blue_steel>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_ingot:2511>);
testMat.representativeItem = <item:gregtech:meta_ingot:2511>;
testMat.addHeadMaterialStats(756, 4.2f, 6.5f, 5);

testMat.addMaterialTrait("sharp");

testMat.itemLocalizer = function(thisMaterial, itemName){return "Blue Steel " + itemName;};
testMat.localizedName = "Blue Steel";
testMat.register();
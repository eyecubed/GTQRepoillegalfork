#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("red_steel");
testMat.color = 0x8c6464;
testMat.liquid = <liquid:red_steel>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_ingot:2510>);
testMat.representativeItem = <item:gregtech:meta_ingot:2510>;
testMat.addHeadMaterialStats(912, 5.2f, 7.5f, 4);
testMat.addHandleMaterialStats(0.3, 1720);

testMat.addMaterialTrait("lightweight");
testMat.addMaterialTrait("momentum");
testMat.addMaterialTrait("blasting");

testMat.itemLocalizer = function(thisMaterial, itemName){return "Red Steel " + itemName;};
testMat.localizedName = "Red Steel";
testMat.register();
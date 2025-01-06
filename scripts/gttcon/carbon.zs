#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("carbon");
testMat.color = 0x141414;
testMat.liquid = <liquid:carbon>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_item_1:499>);
testMat.representativeItem = <item:gregtech:meta_item_1:499>;
testMat.addHeadMaterialStats(1220, 2.3f, 5.5f, 2);
testMat.addHandleMaterialStats(0.3, 500);

testMat.addMaterialTrait("coldblooded", 2);

testMat.itemLocalizer = function(thisMaterial, itemName){return "Carbon " + itemName;};
testMat.localizedName = "Carbon";
testMat.register();
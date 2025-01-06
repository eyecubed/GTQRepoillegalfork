#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("magnalium");
testMat.color = 0xc8beff;
testMat.liquid = <liquid:magnalium>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_ingot:290>);
testMat.representativeItem = <item:gregtech:meta_ingot:290>;
testMat.addHeadMaterialStats(1200, 4.2f, 5.5f, 4);
testMat.addHandleMaterialStats(0.3, 2120);

testMat.addMaterialTrait("lightweight", 2);

testMat.itemLocalizer = function(thisMaterial, itemName){return "Magnalium " + itemName;};
testMat.localizedName = "Magnalium";
testMat.register();
#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("Saturnite");
testMat.color = 0x217E89;
testMat.liquid = <liquid:saturnite>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_ingot:31003>);
testMat.representativeItem = <item:gregtech:meta_ingot:31003>;
testMat.addHeadMaterialStats(9240, 22.2f, 14.5f, 6);

testMat.addMaterialTrait("alien");
testMat.addMaterialTrait("lightweight", 2);
testMat.addMaterialTrait("dense", 2);

testMat.addMaterialTrait("blasting", "bowstring");


testMat.itemLocalizer = function(thisMaterial, itemName){return "Saturnite " + itemName;};
testMat.localizedName = "Saturnite";
testMat.register();
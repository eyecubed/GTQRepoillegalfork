#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("kanthal");
testMat.color = 0xc2d2df;
testMat.liquid = <liquid:kanthal>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_ingot:288>);
testMat.representativeItem = <item:gregtech:meta_ingot:288>;
testMat.addHeadMaterialStats(230, 2.2f, 3.5f, 3);
testMat.addHandleMaterialStats(0.3, 1200);

testMat.addMaterialTrait("lightweight");

testMat.itemLocalizer = function(thisMaterial, itemName){return "Kanthal " + itemName;};
testMat.localizedName = "Kanthal";
testMat.register();
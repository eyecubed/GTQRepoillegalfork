#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("neodymium");
testMat.color = 0xaeacad;
testMat.liquid = <liquid:neodymium>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_ingot:2036>);
testMat.representativeItem = <item:gregtech:meta_ingot:2036>;
testMat.addHeadMaterialStats(590, 3.2f, 4.5f, 2);
testMat.addHandleMaterialStats(0.3, 500);

testMat.addMaterialTrait("alien");

testMat.itemLocalizer = function(thisMaterial, itemName){return "Neodymium " + itemName;};
testMat.localizedName = "Neodymium";
testMat.register();
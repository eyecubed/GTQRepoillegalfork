#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("vanadiumsteel");
testMat.color = 0xaeacad;
testMat.liquid = <liquid:vanadium_steel>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_ingot:2036>);
testMat.representativeItem = <item:gregtech:meta_ingot:2036>;
testMat.addHeadMaterialStats(2300, 10.2f, 9.5f, 4);
testMat.addHandleMaterialStats(0.3, 500);

testMat.addMaterialTrait("dense", null);

testMat.itemLocalizer = function(thisMaterial, itemName){return "Vanadiumsteel " + itemName;};
testMat.localizedName = "Vanadiumsteel";
testMat.register();
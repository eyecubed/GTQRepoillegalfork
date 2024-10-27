#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("black_steel");
testMat.color = 0x646464;
testMat.liquid = <liquid:black_steel>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_ingot:2011>);
testMat.representativeItem = <item:gregtech:meta_ingot:2011>;
testMat.addHeadMaterialStats(840, 7.2f, 2.5f, 4);

testMat.addMaterialTrait("sharp");
testMat.addMaterialTrait("alien");
testMat.addMaterialTrait("dense");

testMat.itemLocalizer = function(thisMaterial, itemName){return "Black Steel " + itemName;};
testMat.localizedName = "Black Steel";
testMat.register();
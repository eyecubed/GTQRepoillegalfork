#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("Tungsten");
testMat.color = 0x323232;
testMat.liquid = <liquid:red_steel>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_ingot:5>);
testMat.representativeItem = <item:gregtech:meta_ingot:5>;
testMat.addHeadMaterialStats(1920, 8.2f, 10.5f, 5);
testMat.addHandleMaterialStats(0.9, 3230);

testMat.addMaterialTrait("tasty");
testMat.addMaterialTrait("dense");
testMat.addMaterialTrait("superheat");

testMat.itemLocalizer = function(thisMaterial, itemName){return "Tungsten " + itemName;};
testMat.localizedName = "Tungsten";
testMat.register();
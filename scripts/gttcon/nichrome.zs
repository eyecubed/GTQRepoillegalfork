#loader contenttweaker
#modloaded tconstruct

val testMat = mods.contenttweaker.tconstruct.MaterialBuilder.create("nichrome");
testMat.color = 0xcdcef6;
testMat.liquid = <liquid:nichrome>;
testMat.castable = true;
testMat.addItem(<item:gregtech:meta_ingot:294>);
testMat.representativeItem = <item:gregtech:meta_ingot:294>;
testMat.addHeadMaterialStats(872, 2.2f, 3.5f, 1);
testMat.addHandleMaterialStats(0.3, 1200);

testMat.addMaterialTrait("splitting");
testMat.addMaterialTrait("aquadynamic");

testMat.itemLocalizer = function(thisMaterial, itemName){return "Nichrome " + itemName;};
testMat.localizedName = "Nichrome";
testMat.register();
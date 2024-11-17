mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreGarnierite'))
    .fluidOutput(fluid('nickel') * 144)
    .time(80)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreGalena'))
    .fluidOutput(fluid('lead') * 144)
    .time(80)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreChalcopyrite'))
    .fluidOutput(fluid('copper') * 144)
    .time(80)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('orePyrite'))
    .fluidOutput(fluid('iron') * 144)
    .time(80)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreMalachite'))
    .fluidOutput(fluid('copper') * 144)
    .time(80)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreCassiterite'))
    .fluidOutput(fluid('tin') * 144)
    .time(23)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreYellowLimonite'))
    .fluidOutput(fluid('iron') * 166)
    .time(80)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreBrownLimonite'))
    .fluidOutput(fluid('iron') * 166)
    .time(80)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreLead'))
    .fluidOutput(fluid('lead') * 122)
    .time(80)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreBasalticMineralSand'))
    .fluidOutput(fluid('iron') * 166)
    .time(80)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreGraniticMineralSand'))
    .fluidOutput(fluid('iron') * 144)
    .time(80)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreCobaltite'))
    .fluidOutput(fluid('cobalt') * 144)
    .time(80)
    .register()

mods.tconstruct.melting.recipeBuilder()
    .input(ore('oreNickel'))
    .fluidOutput(fluid('nickel') * 144)
    .time(23)
    .register()

// Molten Vibrant Alloy * 288
mods.gregtech.alloy_blast_smelter.removeByInput(120, [metaitem('dustEnergeticAlloy'), metaitem('dustEnderPearl'), metaitem('circuit.integrated').withNbt(['Configuration': 2])], null)
// Molten Vibrant Alloy * 288
mods.gregtech.alloy_blast_smelter.removeByInput(120, [metaitem('dustEnergeticAlloy'), metaitem('dustEnderPearl'), metaitem('circuit.integrated').withNbt(['Configuration': 12])], [fluid('nitrogen') * 2000 * 2000])
// Energetic Alloy Dust * 2
mods.gregtech.mixer.removeByInput(30, [metaitem('dustGold') * 2, item('minecraft:redstone'), item('minecraft:glowstone_dust')], null)// Energetic Alloy Dust * 1

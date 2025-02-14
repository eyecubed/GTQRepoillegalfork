mods.jei.ingredient.removeAndHide(item('simpledifficulty:purifiedwater'))
mods.jei.ingredient.removeAndHide(item('forge:bucketfilled').withNbt(['FluidName': 'purifiedwater', 'Amount': 1000]))

///////	Ice Chunk
crafting.remove('simpledifficulty:block_ice')
crafting.remove('simpledifficulty:block_ice_packed')
mods.gregtech.forge_hammer.recipeBuilder().inputs(item('minecraft:ice')).outputs(item('simpledifficulty:ice_chunk') * 4).duration(300).EUt(2).buildAndRegister()
mods.gregtech.macerator.recipeBuilder().inputs(item('simpledifficulty:ice_chunk')).outputs(metaitem('dustSmallIce')).duration(6).EUt(2).buildAndRegister()
mods.gregtech.extractor.recipeBuilder().inputs(item('simpledifficulty:ice_chunk')).fluidOutputs(fluid('ice') * 36).duration(6).EUt(30).buildAndRegister()

///////	Magma Chunk
crafting.remove('simpledifficulty:block_magma')
mods.gregtech.forge_hammer.recipeBuilder().inputs(item('minecraft:magma')).outputs(item('simpledifficulty:magma_chunk') * 4).duration(300).EUt(2).buildAndRegister()
mods.gregtech.macerator.recipeBuilder().inputs(item('simpledifficulty:magma_chunk')).outputs(item('minecraft:magma_cream')).duration(6).EUt(2).buildAndRegister()

///////	Purified Water
crafting.remove('simpledifficulty:potion_filter')

mods.gregtech.canner.recipeBuilder().inputs(item('minecraft:glass_bottle')).fluidInputs(fluid('distilled_water') * 250).outputs(item('simpledifficulty:purified_water_bottle')).duration(200).EUt(7).buildAndRegister()

///////	Charcoal Filter
crafting.removeByOutput(item('simpledifficulty:charcoal_filter'))
crafting.addShaped(item('simpledifficulty:charcoal_filter') * 2, [[item('minecraft:paper')], [item('gregtech:meta_dust:266')], [item('minecraft:paper')]])

///////	Canteen
crafting.remove('simpledifficulty:canteen_empty')
crafting.remove('simpledifficulty:canteen_dumped')
crafting.addShaped(item('simpledifficulty:canteen'),[[ore('string'), ore('leather'), ore('string')],[ore('leather'), null, ore('leather')], [ore('leather'), ore('leather'), ore('leather')]])

///////	Iron Canteen
crafting.remove('simpledifficulty:iron_canteen_empty')
crafting.remove('simpledifficulty:iron_canteen_dumped')
crafting.addShaped(item('simpledifficulty:iron_canteen'),[[ore('string'), ore('ringIron'), ore('string')],[ore('plateIron'), item('simpledifficulty:canteen'), ore('plateIron')], [ore('toolHammer'), ore('plateIron'), ore('toolWrench')]])

mods.gregtech.assembler.recipeBuilder().inputs(ore('plateIron') * 3, item('simpledifficulty:canteen'), ore('ringIron'), ore('string') * 2).outputs(item('simpledifficulty:iron_canteen')).duration(100).EUt(8).buildAndRegister()

///////	Rain Collector
crafting.removeByOutput(item('simpledifficulty:rain_collector'))
crafting.addShaped(item('simpledifficulty:rain_collector'), [[ore('plateIron'), ore('string'), ore('plateIron')], [ore('cobblestone'), item('minecraft:bucket'), ore('cobblestone')], [ore('cobblestone'), ore('cobblestone'), ore('cobblestone')]])

///////	Juices
crafting.removeByOutput(item('simpledifficulty:juice:5'))
crafting.removeByOutput(item('simpledifficulty:juice:6'))
crafting.removeByOutput(item('simpledifficulty:juice:7'))

def juice = [
	'simpledifficulty:juice':	'minecraft:apple',
	'simpledifficulty:juice:1':	'minecraft:beetroot',
	'simpledifficulty:juice:2':	'minecraft:cactus',
	'simpledifficulty:juice:3':	'minecraft:carrot',
	'simpledifficulty:juice:4':	'minecraft:chorus_fruit',
	'simpledifficulty:juice:8':	'minecraft:melon',
	'simpledifficulty:juice:9':	'minecraft:pumpkin'
]
for (entry in juice) {
	crafting.removeByOutput(item(entry.getKey()))
	mods.gregtech.mixer.recipeBuilder().inputs(item('simpledifficulty:purified_water_bottle'), item(entry.getValue()), ore('dustSugar')).fluidInputs(fluid('ice') * 36).outputs(item(entry.getKey())).duration(200).EUt(7).buildAndRegister()
}

mods.gregtech.mixer.recipeBuilder().inputs(item('simpledifficulty:purified_water_bottle'), item('minecraft:golden_carrot'), ore('dustSugar')).fluidInputs(fluid('ice') * 36).outputs(item('simpledifficulty:juice:6')).duration(200).EUt(16).buildAndRegister()
mods.gregtech.mixer.recipeBuilder().inputs(item('simpledifficulty:purified_water_bottle'), item('minecraft:speckled_melon'), ore('dustSugar')).fluidInputs(fluid('ice') * 36).outputs(item('simpledifficulty:juice:7')).duration(200).EUt(16).buildAndRegister()
mods.gregtech.mixer.recipeBuilder().inputs(item('simpledifficulty:purified_water_bottle'), item('minecraft:golden_apple'), ore('dustSugar')).fluidInputs(fluid('ice') * 36).outputs(item('simpledifficulty:juice:5')).duration(200).EUt(16).buildAndRegister()

///////	Campfire & Spit
crafting.removeByOutput(item('simpledifficulty:campfire'))
crafting.addShaped(item('simpledifficulty:campfire'),[[null, ore('stickWood'), null],[ore('stickWood'), ore('logWood'), ore('stickWood')],[ore('cobblestone'), ore('cobblestone'), ore('cobblestone')]])

crafting.removeByOutput(item('simpledifficulty:spit'))
crafting.addShaped(item('simpledifficulty:spit'),[[ore('stickWood'), ore('string'), ore('stickWood')],[ore('stickWood'), null, ore('stickWood')]])

///////	Cloth Armor
crafting.removeByOutput(item('simpledifficulty:wool_helmet'))
crafting.removeByOutput(item('simpledifficulty:wool_chestplate'))
crafting.removeByOutput(item('simpledifficulty:wool_leggings'))
crafting.removeByOutput(item('simpledifficulty:wool_boots'))

crafting.addShaped(item('simpledifficulty:wool_helmet'),[[null, ore('wool'), null],[ore('wool'), item('minecraft:leather_helmet'), ore('wool')],[null, ore('wool'), null]])
crafting.addShaped(item('simpledifficulty:wool_chestplate'),[[null, ore('wool'), null],[ore('wool'), item('minecraft:leather_chestplate'), ore('wool')],[null, ore('wool'), null]])
crafting.addShaped(item('simpledifficulty:wool_leggings'),[[null, ore('wool'), null],[ore('wool'), item('minecraft:leather_leggings'), ore('wool')],[null, ore('wool'), null]])
crafting.addShaped(item('simpledifficulty:wool_boots'),[[null, ore('wool'), null],[ore('wool'), item('minecraft:leather_boots'), ore('wool')],[null, ore('wool'), null]])

///////	Ice Armor
crafting.removeByOutput(item('simpledifficulty:ice_helmet'))
crafting.removeByOutput(item('simpledifficulty:ice_chestplate'))
crafting.removeByOutput(item('simpledifficulty:ice_leggings'))
crafting.removeByOutput(item('simpledifficulty:ice_boots'))

crafting.addShaped(item('simpledifficulty:ice_helmet'),[[null, ore('blockIce'), null],[ore('blockIce'), item('minecraft:chainmail_helmet'), ore('blockIce')],[null, ore('blockIce'), null]])
crafting.addShaped(item('simpledifficulty:ice_chestplate'),[[null, ore('blockIce'), null],[ore('blockIce'), item('minecraft:chainmail_chestplate'), ore('blockIce')],[null, ore('blockIce'), null]])
crafting.addShaped(item('simpledifficulty:ice_leggings'),[[null, ore('blockIce'), null],[ore('blockIce'), item('minecraft:chainmail_leggings'), ore('blockIce')],[null, ore('blockIce'), null]])
crafting.addShaped(item('simpledifficulty:ice_boots'),[[null, ore('blockIce'), null],[ore('blockIce'), item('minecraft:chainmail_boots'), ore('blockIce')],[null, ore('blockIce'), null]])

///////	Thermometer
crafting.removeByOutput(item('simpledifficulty:thermometer'))
mods.gregtech.assembler.recipeBuilder().inputs(item('gregtech:meta_item_1:517'), item('minecraft:comparator')).fluidInputs(fluid('mercury') * 144).outputs(item('simpledifficulty:thermometer')).duration(120).EUt(8).buildAndRegister()

///////	Heater
crafting.removeByOutput(item('simpledifficulty:heater'))
crafting.addShaped(item('simpledifficulty:heater'),[[item('simpledifficulty:magma_chunk'), ore('toolWrench'), item('simpledifficulty:magma_chunk')],[item('simpledifficulty:magma_chunk'), item('gregtech:meta_item_1:96'), item('simpledifficulty:magma_chunk')],[item('minecraft:stone_slab'), ore('stickRedAlloy'), item('minecraft:stone_slab')]])

mods.gregtech.assembler.recipeBuilder().inputs(item('gregtech:meta_item_1:96'), item('simpledifficulty:magma_chunk') * 4, ore('stickRedAlloy')).fluidInputs(fluid('concrete') * 144).outputs(item('simpledifficulty:heater')).duration(100).EUt(16).buildAndRegister()

///////	Chiller
crafting.removeByOutput(item('simpledifficulty:chiller'))
crafting.addShaped(item('simpledifficulty:chiller'),[[item('simpledifficulty:ice_chunk'), ore('toolWrench'), item('simpledifficulty:ice_chunk')],[item('simpledifficulty:ice_chunk'), item('gregtech:meta_item_1:96'), item('simpledifficulty:ice_chunk')],[item('minecraft:stone_slab'), ore('stickRedAlloy'), item('minecraft:stone_slab')]])

mods.gregtech.assembler.recipeBuilder().inputs(item('gregtech:meta_item_1:96'), item('simpledifficulty:ice_chunk') * 4, ore('stickRedAlloy')).fluidInputs(fluid('concrete') * 144).outputs(item('simpledifficulty:chiller')).duration(100).EUt(16).buildAndRegister()
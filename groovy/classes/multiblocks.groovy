ore('ingotTitanium').remove(item('hbm:ingot_titanium'))
ore('Titanium').remove(item('hbm:ingot_titanium'))

recipemap('centrifuge').recipeBuilder()
        .inputs(item('jaopca:dust.end_steel'))
        .chancedOutput(item('hbm:powder_schrabidium'), 500, 500)
        .duration(200).EUt(32000).buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
        .inputs(item('hbm:powder_schrabidium'), item('draconicevolution:draconium_dust'))
        .fluidInputs(fluid('watz'))
        .outputs(item('draconicevolution:nugget'))
        .duration(200).EUt(32000).buildAndRegister()
        
recipemap('assembler').recipeBuilder()
         .inputs(ore('dustTin'))
         .inputs(item('gregtech:meta_dust', 320))
         .outputs(item('enderio:item_material', 22))
         .duration(200).EUt(120).buildAndRegister()

recipemap('centrifuge').recipeBuilder()
        .inputs(item('bloodmagic:component:8'))
        .chancedOutput(item('embers:shard_ember'), 500, 500)
        .duration(200).EUt(120).buildAndRegister()

recipemap('mixer').recipeBuilder()
        .inputs(ore('dustStainlessSteel'), ore('dustLithium'))
        .outputs(item('libvulpes:productgem'))
        .duration(200).EUt(200).buildAndRegister()
    
recipemap('mixer').recipeBuilder()
        .inputs(ore('dustStainlessSteel'), ore('dustLithium'))
        .outputs(item('libvulpes:productgem'))
        .duration(200).EUt(200).buildAndRegister()

content.createItem('ultradense_mixture')
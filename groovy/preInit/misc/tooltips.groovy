import net.minecraftforge.event.entity.player.ItemTooltipEvent

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('gt_aurora:hyperconducting_antischrabidic_circuit')) {
        event.getToolTip() << 'ZPM-Tier Circuit§7 - Taking advantage of Positrons'
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('gtaurora:data.nuclear')) {
        event.getToolTip() << 'Data on Nuclear Forces'
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('gtaurora:data.neutrino')) {
        event.getToolTip() << 'Data on Neutrinos'
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('gtaurora:data.subatomic')) {
        event.getToolTip() << 'Data on Subatomic Particles'
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('gtaurora:data.elementary')) {
        event.getToolTip() << 'Data on Elementary Particles'
    }
}
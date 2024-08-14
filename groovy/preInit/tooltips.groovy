import net.minecraftforge.event.entity.player.ItemTooltipEvent

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('gt_aurora:hyperconducting_antischrabidic_circuit')) {
        event.getToolTip() << '§4UHV-Tier Circuit§7 - Taking advantage of Positrons'
    }
}
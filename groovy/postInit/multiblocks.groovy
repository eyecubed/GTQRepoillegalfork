import gregtech.common.metatileentities.MetaTileEntities
import classes.MetaTileEntitySteamLargeHammer
import classes.MetaTileEntityAlloyKiln
import classes.MetaTileEntitySteamMixer

if (!isReloading()) {
MetaTileEntities.registerMetaTileEntity(32001, new MetaTileEntitySteamLargeHammer(new ResourceLocation("gtaurora", "large_steam_hammer")))
MetaTileEntities.registerMetaTileEntity(32002, new MetaTileEntityAlloyKiln(new ResourceLocation("gtaurora", "alloy_kiln")))
MetaTileEntities.registerMetaTileEntity(32003, new MetaTileEntitySteamMixer(new ResourceLocation("gtaurora", "steam_mixer")))
}

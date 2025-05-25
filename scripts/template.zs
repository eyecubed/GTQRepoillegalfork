#loader preinit

import mods.ingameinfo.mvvm.ViewModel;
import mods.ingameinfo.mvvm.View;
import mods.ingameinfo.mvvm.Mvvm;
import mods.ingameinfo.Types;
import mods.ingameinfo.igievent.EventCenter;
import mods.ingameinfo.gui.IgiGuiManager;
import mods.ingameinfo.event.IgiGuiInitEvent;
import mods.ingameinfo.animation.text.TextAnimDef;
import mods.ingameinfo.animation.SmoothDamp;
import crafttweaker.util.Math;

events.onIgiGuiInit(function(event as IgiGuiInitEvent)
{
    IgiGuiManager.openGui("template");
});
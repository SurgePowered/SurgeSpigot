package com.arrayprolc.surge.exclusive.main;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.arrayprolc.surge.exclusive.listener.spigot.server.ServerTickListener;
import com.arrayprolc.surge.exclusive.types.launcher.WrappedPlugin;
import com.arrayprolc.surge.global.main.Surge;
import com.arrayprolc.surge.global.types.platform.Platform;

public class SurgeSpigot extends JavaPlugin {

    Surge sf;

    public Listener[] getListenerList() {
        return new Listener[] { new ServerTickListener() };
    }

    public void onEnable() {
        sf = new Surge();
        sf.initialize(Platform.SPIGOT, new WrappedPlugin(this));
    }
    
    public void onDisable(){
        sf.onDisable();
    }

}

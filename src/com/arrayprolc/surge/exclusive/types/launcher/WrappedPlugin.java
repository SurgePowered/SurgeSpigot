package com.arrayprolc.surge.exclusive.types.launcher;

import com.arrayprolc.surge.exclusive.main.SurgeSpigot;

public class WrappedPlugin {

    private SurgeSpigot plugin;

    public WrappedPlugin(SurgeSpigot instance) {
        plugin = instance;
    }

    public SurgeSpigot getPlugin() {
        return plugin;
    }

}

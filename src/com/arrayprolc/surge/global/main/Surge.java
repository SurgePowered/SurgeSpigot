package com.arrayprolc.surge.global.main;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import com.arrayprolc.surge.exclusive.types.event.SpigotEvents;
import com.arrayprolc.surge.exclusive.types.launcher.WrappedPlugin;
import com.arrayprolc.surge.global.exception.InvalidPlatformException;
import com.arrayprolc.surge.global.plugin.UniversalPlugin;
import com.arrayprolc.surge.global.types.platform.Platform;

public class Surge {

    private Platform gamePlatform;
    private static Surge instance;
    private static boolean enabled = false;
    private WrappedPlugin plugin;
    private ArrayList<UniversalPlugin> plugins = new ArrayList<UniversalPlugin>();

    public static Surge getInstance() {
        return instance;
    }

    public Surge() {
        System.out.println("[Surge] Initialized!");
    }

    public void initialize(Platform platform, WrappedPlugin plugin) {
        if (enabled) {
            throw new ConcurrentModificationException("Surge was initialized twice... not good!");
        }
        enabled = true;
        instance = this;
        gamePlatform = platform;
        registerEvents();
        this.plugin = plugin;
    }

    public void registerEvents() {
        if (getGamePlatform() == Platform.SPIGOT) {
            try {
                SpigotEvents.registerEvents(this, plugin);
            } catch (InvalidPlatformException e) {
                System.out.println(e.getMessage());
                System.out.println("[FATAL] Shutting down.");
                System.exit(0);
            }
        }
    }

    public void onDisable() {

    }

    public Platform getGamePlatform() {
        return gamePlatform;
    }

    public void registerPlugin(UniversalPlugin plugin) {
        plugins.add(plugin);
    }

}

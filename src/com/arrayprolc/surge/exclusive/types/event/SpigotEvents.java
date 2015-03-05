package com.arrayprolc.surge.exclusive.types.event;

import com.arrayprolc.surge.exclusive.types.launcher.WrappedPlugin;
import com.arrayprolc.surge.global.exception.InvalidPlatformException;
import com.arrayprolc.surge.global.main.Surge;
import com.arrayprolc.surge.global.types.platform.Platform;

public class SpigotEvents {

    public static void registerEvents(Surge instance, WrappedPlugin plugin) throws InvalidPlatformException {
        if (instance.getGamePlatform() != Platform.SPIGOT) {
            throw new InvalidPlatformException("Trying to register events for Spigot, but application is not Spigot!");
        }
 /*       for (org.bukkit.event.Listener l : plugin.getPlugin().getListenerList()) {
            try{
            org.bukkit.Bukkit.getServer().getPluginManager().registerEvents(l, plugin.getPlugin());
            }catch(NullPointerException e){
                System.out.println("[SF-ERROR] " + l.getClass().getName() + " could not be loaded.");
            }
        }*/
    }

}

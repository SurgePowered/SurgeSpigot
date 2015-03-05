package com.arrayprolc.surge.exclusive.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.arrayprolc.surge.exclusive.command.SpigotCommandHandler;
import com.arrayprolc.surge.exclusive.listener.spigot.server.ServerTickListener;
import com.arrayprolc.surge.exclusive.types.launcher.WrappedPlugin;
import com.arrayprolc.surge.global.main.Surge;
import com.arrayprolc.surge.global.main.SurgePlugin;
import com.arrayprolc.surge.global.types.platform.Platform;

public class SurgeSpigot extends JavaPlugin {

    Surge sf;
    SurgePlugin plugin;

    public Listener[] getListenerList() {
        return new Listener[] { new ServerTickListener() };
    }

    public void onEnable() {
        sf = new Surge();
        sf.initialize(Platform.SPIGOT, new WrappedPlugin(this));
        plugin = new SurgePlugin();
        plugin.onEnable();
    } 

    public void onDisable() {
        plugin.onDisable();
        sf.onDisable();
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return SpigotCommandHandler.onCommand(sender, command, label, args);
    }

}

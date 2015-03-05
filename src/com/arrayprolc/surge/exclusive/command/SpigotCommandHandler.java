package com.arrayprolc.surge.exclusive.command;

import org.bukkit.command.Command;

import com.arrayprolc.surge.exclusive.listener.sender.CommandSender;
import com.arrayprolc.surge.global.command.CommandHandler;
import com.arrayprolc.surge.global.exception.InvalidPlatformException;

public class SpigotCommandHandler {

    public static boolean onCommand(org.bukkit.command.CommandSender sender, Command command, String label, String[] args) {
        try {
            CommandHandler.handleCommand(new CommandSender(sender), label
                    , args);
        } catch (InvalidPlatformException e) {
            System.out.println("[SG-ERROR] Tried to hook a command with Spigot but Spigot is not the active platform!");
        }
        return false;
    }

}

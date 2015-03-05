package com.arrayprolc.surge.global.main.listener;

import com.arrayprolc.surge.exclusive.listener.sender.CommandSender;
import com.arrayprolc.surge.global.command.Command;
import com.arrayprolc.surge.global.command.CommandListener;
import com.arrayprolc.surge.global.main.Surge;
import com.arrayprolc.surge.global.plugin.UniversalPlugin;

public class SurgeCommandListener extends CommandListener {

    @Override
    public boolean handleCommand(CommandSender sender, Command command, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§cUsage > §7/surge (version/plugins/disable)");
            return true;
        }
        // TODO permissions!
        String option = args[0].toLowerCase();
        switch (option) {
        case "version":
            // TODO make global
            sender.sendMessage("§bSurge > §7Version 0.0.1");
            return true;
        case "plugins":
            String builder = "§7(Total §b" + Surge.getInstance().getPlugins().size() + "§7): ";
            boolean first = true;
            for (UniversalPlugin plugin : Surge.getInstance().getPlugins()) {
                if (first) {
                    builder = builder + "§b" + plugin.getModID() + "§7";
                    first = false;
                } else {
                    builder = builder + "§7, §b" + plugin.getModID() + "§7";
                }
            }
            sender.sendMessage("§bSurge > " + builder);
            return true;
        case "disable":
            sender.sendMessage("§bSurge > §7WIP.");
            return true;
        default:
            sender.sendMessage("§cUsage > §7/surge (version/plugins/disable)");
            return true;
        }
    }

}

package com.arrayprolc.surge.global.command;

import java.util.ArrayList;

import com.arrayprolc.surge.exclusive.listener.sender.CommandSender;
import com.arrayprolc.surge.global.main.Surge;
import com.arrayprolc.surge.global.plugin.UniversalPlugin;

public class CommandHandler {

    public static boolean handleCommand(CommandSender sender, String command, String[] args){
        for(UniversalPlugin plugin : Surge.getInstance().getPlugins()){
            for(Command cmd : plugin.getCommands(new ArrayList<Command>())){
                boolean found = false;
                for(String s : cmd.getAlternatives()){
                    if(cmd.isCaseSensitive()){
                        if(command.equals(s)){
                            found = true;
                        }
                    }else{
                        if(command.equalsIgnoreCase(s)){
                            found = true;
                        }
                    }
                }
                if(found){
                    return cmd.getListener().handleCommand(sender, cmd, args);
                }

            }
        }
        sender.sendMessage("§bSurge > §7No plugin has properly catched that command. Please report this to all developers using Surge!");
        return false;
    }
    
}

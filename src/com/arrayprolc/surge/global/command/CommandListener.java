package com.arrayprolc.surge.global.command;

import com.arrayprolc.surge.exclusive.listener.sender.CommandSender;

public abstract class CommandListener {
    
    public abstract boolean handleCommand(CommandSender sender, Command command, String[] args);

}

package com.arrayprolc.surge.global.command;

import com.arrayprolc.surge.exclusive.listener.sender.CommandSender;

public abstract class CommandListener {
    
    public abstract void handleCommand(CommandSender sender, Command command);

}

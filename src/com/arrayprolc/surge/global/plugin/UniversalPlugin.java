package com.arrayprolc.surge.global.plugin;

import java.util.ArrayList;

import com.arrayprolc.surge.global.command.Command;
import com.arrayprolc.surge.global.main.Surge;

public abstract class UniversalPlugin {

    public void onEnable(){
        Surge.getInstance().registerPlugin(this);
    }

    public abstract void onDisable();

    public abstract void getListeners();
    
    public abstract void getCommands(ArrayList<Command> list);
    
    public abstract String getModID();
    
}

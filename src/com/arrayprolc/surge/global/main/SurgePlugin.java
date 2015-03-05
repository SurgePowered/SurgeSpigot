package com.arrayprolc.surge.global.main;

import java.util.ArrayList;

import com.arrayprolc.surge.global.command.Command;
import com.arrayprolc.surge.global.main.listener.SurgeCommandListener;
import com.arrayprolc.surge.global.plugin.UniversalPlugin;

public class SurgePlugin extends UniversalPlugin {

    private Command surge = new Command(this, "surge", new String[] { "surge", "sge", "sf", "sg", "surgeinfo", "surge-surge" }, new SurgeCommandListener());

    @Override
    public void onDisable() {

    }

    @Override
    public void getListeners() {

    }

    @Override
    public ArrayList<Command> getCommands(ArrayList<Command> list) {
        list.add(surge);
        return list;

    }

    @Override
    public String getModID() {
        return "surge";
    }

}

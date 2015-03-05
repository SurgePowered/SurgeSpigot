package com.arrayprolc.surge.exclusive.types.location;

public class World {

    private org.bukkit.World object;

    public String getName() {
        return object.getName();
    }

    public World(Object w) {
        this.object = (org.bukkit.World) w;
    }

    public Object getSpigotObject() {
        return object;
    }

}

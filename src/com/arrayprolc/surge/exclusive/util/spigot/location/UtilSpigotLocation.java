package com.arrayprolc.surge.exclusive.util.spigot.location;

import com.arrayprolc.surge.exclusive.types.location.Location;
import com.arrayprolc.surge.exclusive.types.location.World;

public class UtilSpigotLocation {

    public static Location toUniversalLocation(org.bukkit.Location origin) {
        // TODO fix this
        return new Location((World) origin.getWorld(), origin.getX(), origin.getY(), origin.getZ(), origin.getYaw(), origin.getPitch());
    }

    public static org.bukkit.Location toSpigotLocation(Location origin) {
     // TODO fix this
        return new org.bukkit.Location((org.bukkit.World) origin.getWorld(), origin.getX(), origin.getY(), origin.getZ(), origin.getYaw(), origin.getPitch());
    }

}

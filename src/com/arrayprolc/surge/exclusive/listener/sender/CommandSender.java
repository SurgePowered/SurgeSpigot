package com.arrayprolc.surge.exclusive.listener.sender;

import com.arrayprolc.surge.exclusive.types.entity.Player;
import com.arrayprolc.surge.global.exception.InvalidPlatformException;
import com.arrayprolc.surge.global.main.Surge;
import com.arrayprolc.surge.global.types.platform.Platform;

public class CommandSender {

    private org.bukkit.command.CommandSender object;

    public CommandSender(org.bukkit.command.CommandSender object) throws InvalidPlatformException {
        if (Surge.getInstance().getGamePlatform() != Platform.SPIGOT) {
            throw new InvalidPlatformException("Cannot get a Spigot player object on a non-spigot host!");
        }
        this.object = object;
    }

    public void sendMessage(String paramString) {
        object.sendMessage(paramString);
    }

    public boolean isPlayer() {
        return object instanceof org.bukkit.entity.Player;
    }

    public Player getPlayer() {
        org.bukkit.entity.Player pl = (org.bukkit.entity.Player) object;
        try {
            return Player.fromSpigotObject(pl);
        } catch (InvalidPlatformException e) {
            return (Player)this;
        }
    }

    public void sendMessage(String[] paramArrayOfString) {
        object.sendMessage(paramArrayOfString);
    }

    public String getName() {
        return object.getName();
    }

    /**
     * @deprecated because usage is not recommended.
     */
    @Deprecated
    public Object getSpigotObject() throws InvalidPlatformException {
        if (Surge.getInstance().getGamePlatform() != Platform.SPIGOT) {
            throw new InvalidPlatformException("Cannot get a Spigot player object on a non-spigot host!");
        }
        return object;
    }

}

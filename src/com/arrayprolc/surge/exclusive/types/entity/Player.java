package com.arrayprolc.surge.exclusive.types.entity;

import java.net.InetSocketAddress;






import com.arrayprolc.surge.exclusive.types.location.Location;
import com.arrayprolc.surge.exclusive.util.spigot.location.UtilSpigotLocation;
import com.arrayprolc.surge.global.exception.InvalidPlatformException;

public class Player extends com.arrayprolc.surge.exclusive.listener.sender.CommandSender {

    private org.bukkit.entity.Player object;

    public String getDisplayName() {
        return object.getDisplayName();
    }

    public void setDisplayName(String name) {
        object.setDisplayName(name);
    }

    public String getPlayerListName() {
        return object.getPlayerListName();
    }

    public void setPlayerListName(String name) {
        object.setPlayerListName(name);
    }

    public InetSocketAddress getAddress() {
        return object.getAddress();
    }

    public void sendRawMessage(String message) {
        object.sendRawMessage(message);
    }

    public void chat(String chat) {
        object.chat(chat);
    }

    public void performCommand(String command) {
        object.performCommand(command);
    }

    public boolean isSneaking() {
        return object.isSneaking();
    }

    public void setSneaking(boolean sneaking) {
        object.setSneaking(sneaking);
    }

    public boolean isSprinting() {
        return object.isSprinting();
    }

    public void setSprinting(boolean sprinting) {
        object.setSprinting(sprinting);
    }

    public void giveExp(int expGive) {
        object.giveExp(expGive);
    }

    public void giveExpLevels(int expLevels) {
        object.giveExpLevels(expLevels);
    }

    public float getExp() {
        return object.getExp();
    }

    public void setExp(float exp) {
        object.setExp(exp);
    }

    public int getLevel() {
        return object.getLevel();
    }

    public void setLevel(int level) {
        object.setLevel(level);
    }

    public int getFoodLevel() {
        return object.getFoodLevel();
    }

    public void setFoodLevel(int foodLevel) {
        object.setFoodLevel(foodLevel);
    }

    public Location getBedSpawnLocation() {
        return UtilSpigotLocation.toUniversalLocation(object.getBedSpawnLocation());
    }

    public void setBedSpawnLocation(Location bedSpawnLocation) {
        object.setBedSpawnLocation(UtilSpigotLocation.toSpigotLocation(bedSpawnLocation));
    }
    
    public void setBedSpawnLocation(Location bedSpawnLocation, boolean paramBoolean) {
        object.setBedSpawnLocation(UtilSpigotLocation.toSpigotLocation(bedSpawnLocation), paramBoolean);
    }
    
    public boolean getAllowFlight(){
        return object.getAllowFlight();
    }
    
    public void setAllowFlight(boolean allowFlight){
        object.setAllowFlight(allowFlight);
    }
    
    public boolean isFlying(){
        return object.isFlying();
    }
    
    public void setFlying(boolean flying){
        object.setFlying(flying);
    }
    
    public void setFlySpeed(float flySpeed) throws IllegalArgumentException {
        object.setFlySpeed(flySpeed);
    }
    
    public void setWalkSpeed(float walkSpeed) throws IllegalArgumentException {
        object.setWalkSpeed(walkSpeed);
    }
    
    public Object getSpigotObject() throws InvalidPlatformException {
        return object;
    }
    

}

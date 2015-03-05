package com.arrayprolc.surge.exclusive.types.location;

public class Location {

    private org.bukkit.Location object;

    private com.arrayprolc.surge.exclusive.types.location.World world;
    private double x;
    private double y;
    private double z;
    private float pitch;
    private float yaw;

    public Location(World world, double x, double y, double z, float yaw, float pitch) {
        super();
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
        this.pitch = pitch;
        this.yaw = yaw;
    }

    public com.arrayprolc.surge.exclusive.types.location.World getWorld() {
        return world;
    }

    public void setWorld(com.arrayprolc.surge.exclusive.types.location.World world) {
        this.world = world;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    public float getYaw() {
        return yaw;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

}

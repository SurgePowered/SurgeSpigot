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

    public Location(Object l) {
        org.bukkit.Location loc = (org.bukkit.Location) l;
        object = loc;
        this.x = loc.getX();
        this.y = loc.getY();
        this.z = loc.getZ();
        this.world = new World(loc.getWorld());
        this.pitch = loc.getPitch();
        this.yaw = loc.getYaw();

    }

    public Location add(double addX, double addY, double addZ, float addYaw, float addPitch) {
        setX(getX() + addX);
        setY(getY() + addY);
        setZ(getZ() + addZ);
        setYaw(getYaw() + addYaw);
        setPitch(getPitch() + addPitch);
        return this;
    }

    public Location add(double addX, double addY, double addZ, float addYaw) {
        return add(addX, addY, addZ, 0);
    }

    public Location add(double addX, double addY, double addZ) {
        return add(addX, addY, addZ, 0, 0);
    }

    public Location add(double addX, double addY) {
        return add(addX, addY, 0, 0, 0);
    }

    public Location add(double addX) {
        return add(addX, 0, 0, 0, 0);
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

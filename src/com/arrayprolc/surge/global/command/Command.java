package com.arrayprolc.surge.global.command;

import com.arrayprolc.surge.global.plugin.UniversalPlugin;

public class Command {

    private UniversalPlugin plugin;
    private String name;
    private String[] alternatives;
    private boolean prefixRequiring = true;
    private char[] prefixes = new char[] { '/' };
    private boolean isCaseSensitive = false;
    private boolean needsPermission = false;
    private boolean overrideOp = true;
    private String permission = "use";
    private boolean permissionForSubcommands;
    private CommandListener listener;
    
    public Command(UniversalPlugin plugin, String name, String[] alternatives, CommandListener listener) {
        super();
        this.plugin = plugin;
        this.name = name;
        this.alternatives = alternatives;
        this.listener = listener;
    }
    
    public CommandListener getListener(){
        return listener;
    }
    
    /**
     * @return the plugin
     */
    public UniversalPlugin getPlugin() {
        return plugin;
    }
    /**
     * @param plugin the plugin to set
     */
    public void setPlugin(UniversalPlugin plugin) {
        this.plugin = plugin;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the alternatives
     */
    public String[] getAlternatives() {
        return alternatives;
    }
    /**
     * @param alternatives the alternatives to set
     */
    public void setAlternatives(String[] alternatives) {
        this.alternatives = alternatives;
    }
    /**
     * @return the prefixRequiring
     */
    public boolean isPrefixRequiring() {
        return prefixRequiring;
    }
    /**
     * @param prefixRequiring the prefixRequiring to set
     */
    public void setPrefixRequiring(boolean prefixRequiring) {
        this.prefixRequiring = prefixRequiring;
    }
    /**
     * @return the prefixes
     */
    public char[] getPrefixes() {
        return prefixes;
    }
    /**
     * @param prefixes the prefixes to set
     */
    public void setPrefixes(char[] prefixes) {
        this.prefixes = prefixes;
    }
    /**
     * @return the isCaseSensitive
     */
    public boolean isCaseSensitive() {
        return isCaseSensitive;
    }
    /**
     * @param isCaseSensitive the isCaseSensitive to set
     */
    public void setCaseSensitive(boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
    }
    /**
     * @return the needsPermission
     */
    public boolean isNeedsPermission() {
        return needsPermission;
    }
    /**
     * @param needsPermission the needsPermission to set
     */
    public void setNeedsPermission(boolean needsPermission) {
        this.needsPermission = needsPermission;
    }
    /**
     * @return the overrideOp
     */
    public boolean isOverrideOp() {
        return overrideOp;
    }
    /**
     * @param overrideOp the overrideOp to set
     */
    public void setOverrideOp(boolean overrideOp) {
        this.overrideOp = overrideOp;
    }
    /**
     * @return the permission
     */
    public String getPermission() {
        return permission;
    }
    /**
     * @param permission the permission to set
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }
    /**
     * @return the permissionForSubcommands
     */
    public boolean isPermissionForSubcommands() {
        return permissionForSubcommands;
    }
    /**
     * @param permissionForSubcommands the permissionForSubcommands to set
     */
    public void setPermissionForSubcommands(boolean permissionForSubcommands) {
        this.permissionForSubcommands = permissionForSubcommands;
    }

}

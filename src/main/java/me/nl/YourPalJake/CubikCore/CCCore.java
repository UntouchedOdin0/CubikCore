package me.nl.YourPalJake.CubikCore;

import org.bukkit.plugin.java.JavaPlugin;

public class CCCore extends JavaPlugin{

    public static CCCore core;

    @Override
    public void onEnable(){
        core = this;
    }

    @Override
    public void onDisable(){
        
    }

}

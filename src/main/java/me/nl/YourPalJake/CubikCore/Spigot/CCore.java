package me.nl.YourPalJake.CubikCore.Spigot;

import org.bukkit.plugin.java.JavaPlugin;

public class CCore extends JavaPlugin{



    @Override
    public void onEnable(){
        new FileManager().setup(this);
        new MySQL().setupConnection();
    }

    @Override
    public void onDisable(){

    }
}

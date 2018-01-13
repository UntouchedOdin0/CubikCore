package me.nl.YourPalJake.CubikCore;

import me.nl.YourPalJake.CubikCore.Hooks.PlaceholderAPI;
import me.nl.YourPalJake.CubikCore.Server.CServer;
import org.bukkit.plugin.java.JavaPlugin;

public class CCCore extends JavaPlugin{

    public static CubikPlayerManager cpm;

    @Override
    public void onEnable(){
        Cubik.setCubikServer(new CServer());
        cpm = new CubikPlayerManager();
        registerHooks();

    }

    @Override
    public void onDisable(){
        
    }

    private void registerHooks(){
        new PlaceholderAPI(this).onLoad();
    }

}

package me.nl.YourPalJake.CubikCore;

import me.nl.YourPalJake.CubikCore.Events.Provided.PlayerJoin;
import me.nl.YourPalJake.CubikCore.Events.Provided.PlayerMove;
import me.nl.YourPalJake.CubikCore.Events.Provided.PlayerQuit;
import me.nl.YourPalJake.CubikCore.Hooks.PlaceholderAPI;
import me.nl.YourPalJake.CubikCore.Mojang.MojangCore;
import me.nl.YourPalJake.CubikCore.Player.CubikPlayerManager;
import me.nl.YourPalJake.CubikCore.Plugin.CubikPluginManager;
import me.nl.YourPalJake.CubikCore.Server.CServer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CCCore extends JavaPlugin{


    @Override
    public void onEnable(){
        MojangCore.setup();
        Cubik.setCubikServer(new CServer());
        Cubik.setCubikPluginManager(new CubikPluginManager());
        Cubik.setCubikPlayerManager(new CubikPlayerManager());
        registerHooks();

    }

    @Override
    public void onDisable(){
        
    }

    private void registerEvents(){
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerQuit(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerMove(), this);
    }

    private void registerHooks(){
        new PlaceholderAPI(this).onLoad();
    }

}

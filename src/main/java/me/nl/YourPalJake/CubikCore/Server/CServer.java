package me.nl.YourPalJake.CubikCore.Server;

import me.nl.YourPalJake.CubikCore.Player.CubikPlayer;
import me.nl.YourPalJake.CubikCore.Player.CubikPlayerManager;
import me.nl.YourPalJake.CubikCore.Plugin.CubikPluginManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class CServer implements CubikServer{
    private CubikPluginManager cubikPluginManager;
    private CubikPlayerManager cubikPlayerManager;

    @Override
    public void setCubikPluginManger(CubikPluginManager cpm) {
        if(cubikPluginManager != null){
            Bukkit.getLogger().severe("Cannot make a second instance of CubikPluginManager");
        }else{
            this.cubikPluginManager = cpm;
        }
    }

    @Override
    public void setCubikPlayerManager(CubikPlayerManager cpm) {
        if(this.cubikPlayerManager != null){
            Bukkit.getLogger().severe("Cannot make a second instance of CubikPlayerManager");
        }else{
            this.cubikPlayerManager = cpm;
        }
    }

    @Override
    public CubikPluginManager getCubikPluginManager() {
        return this.cubikPluginManager;
    }

    @Override
    public CubikPlayerManager getCubikPlayerManager() {
        return this.cubikPlayerManager;
    }

    @Override
    public CubikPlayer getCubikPlayer(String name) {
        return this.cubikPlayerManager.getCubikPlayer(name);
    }

    @Override
    public CubikPlayer getCubikPlayer(UUID uuid) {
        String name = Bukkit.getServer().getPlayer(uuid).getName();
        return this.cubikPlayerManager.getCubikPlayer(name);
    }

    @Override
    public CubikPlayer getCubikPlayer(Player player) {
        String name = player.getName();
        return this.cubikPlayerManager.getCubikPlayer(name);
    }

    @Override
    public boolean isCubikPlayerOnline(String name) {
        return (Bukkit.getServer().getPlayer(name) != null);
    }

    @Override
    public boolean isCubikPlayerOnline(UUID uuid) {
        return (Bukkit.getServer().getPlayer(uuid) != null);
    }
}

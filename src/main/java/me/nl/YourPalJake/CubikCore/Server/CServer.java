package me.nl.YourPalJake.CubikCore.Server;

import me.nl.YourPalJake.CubikCore.CCCore;
import me.nl.YourPalJake.CubikCore.Cubik;
import me.nl.YourPalJake.CubikCore.Player.CubikPlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class CServer implements CubikServer{


    @Override
    public CubikPlayer getCubikPlayer(String name) {
        return Cubik.getCubikPlayerManager().getCubikPlayer(name);
    }

    @Override
    public CubikPlayer getCubikPlayer(UUID uuid) {
        String name = Bukkit.getServer().getPlayer(uuid).getName();
        return Cubik.getCubikPlayerManager().getCubikPlayer(name);
    }

    @Override
    public CubikPlayer getCubikPlayer(Player player) {
        String name = player.getName();
        return Cubik.getCubikPlayerManager().getCubikPlayer(name);
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

package me.nl.YourPalJake.CubikCore;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;

public class CubikPlayerManager implements Listener{

    private HashMap<String, CubikPlayer> cubikPlayerHashMap = new HashMap<>();



    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){

    }

}

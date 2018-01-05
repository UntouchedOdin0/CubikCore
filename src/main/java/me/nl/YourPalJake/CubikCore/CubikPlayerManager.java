package me.nl.YourPalJake.CubikCore;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;

public class CubikPlayerManager implements Listener{

    private HashMap<String, CubikPlayer> cubikPlayerHashMap = new HashMap<>();



    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){

        CubikPlayer newCubikPlayer = new CubikPlayer() {
            @Override
            public Player getPlayer() {
                return e.getPlayer();
            }

            @Override
            public String getName() {
                return e.getPlayer().getName();
            }
        };
    }

}

package me.nl.YourPalJake.CubikCore.Events.Provided;

import me.nl.YourPalJake.CubikCore.Cubik;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener{

    //TODO: Get values from MySQL/SQLLite

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();

    }


}

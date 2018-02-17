package me.nl.YourPalJake.CubikCore.Events.Provided;

import me.nl.YourPalJake.CubikCore.Cubik;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener{


    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e){
        Player player = e.getPlayer();
        Cubik.getCubikPlayerManager().removeCubikPlayer(player.getName());

    }


}

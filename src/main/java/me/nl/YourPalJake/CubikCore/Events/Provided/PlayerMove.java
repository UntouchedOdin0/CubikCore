package me.nl.YourPalJake.CubikCore.Events.Provided;

import me.nl.YourPalJake.CubikCore.Cubik;
import me.nl.YourPalJake.CubikCore.Player.CubikPlayer;
import me.nl.YourPalJake.CubikCore.Events.Custom.PlayerFrozenEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener{




    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e){
        Player player = e.getPlayer();
        CubikPlayer cplayer = Cubik.getCubikServer().getCubikPlayer(player);
        //Frozen check
        if(cplayer.isFrozen()){
            PlayerFrozenEvent pfe = new PlayerFrozenEvent(player);
            Bukkit.getPluginManager().callEvent(pfe);
            if(!pfe.isCanceled()){
                e.setCancelled(true);
            }
        }

    }

}

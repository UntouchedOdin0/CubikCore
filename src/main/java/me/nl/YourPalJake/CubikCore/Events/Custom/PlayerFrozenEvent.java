package me.nl.YourPalJake.CubikCore.Events.Custom;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This event will get triggered if a player tries to move
 */
public class PlayerFrozenEvent extends Event{
    private static final HandlerList handlers = new HandlerList();
    private Player player;
    boolean canceled = false;

    public PlayerFrozenEvent(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return this.player;
    }

    public void setCanceled(boolean canceled){
        this.canceled = canceled;
    }

    public boolean isCanceled(){
        return this.canceled;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

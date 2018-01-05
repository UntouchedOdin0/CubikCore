package me.nl.YourPalJake.CubikCore;

import org.bukkit.entity.Player;

public interface CubikPlayer {

    /**
     * Returns the player instance
     *
     * @return The player
     */
    Player getPlayer();

    /**
     * Returns the player name
     *
     * @return CubikPlayers name
     */
    String getName();

    /**
     * Sets the players custom name
     * This can be used for example chat format
     * Note the default is the players name
     *
     * @param name The name
     */
    void setCustomName(String name);

    /**
     *
     * @return
     */
    String getCustomName();
}

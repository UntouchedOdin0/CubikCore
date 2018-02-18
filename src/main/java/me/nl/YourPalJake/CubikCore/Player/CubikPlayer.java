package me.nl.YourPalJake.CubikCore.Player;

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
     * @return CubikPlayer's name
     */
    String getName();

    /**
     * Sets the CubikPlayer custom name
     * This can be used for example chat format
     * Note the default is the latest CustomName
     * Defined in the Player file
     *
     * @param name The name
     */
    void setCustomName(String name);

    /**
     * Get the custom name from the CubikPlayer
     *
     * @return CubikPlayer's custom name
     */
    String getCustomName();

    /**
     * See if the player has a customName
     *
     * @return true or false
     */
    boolean hasCustomName();

    /**
     * Set the player frozen
     *
     * @param frozen true/false
     */
    void setFrozen(boolean frozen);

    /**
     * Get if the player is frozen
     *
     * @return true/false
     */
    boolean isFrozen();
}

package me.nl.YourPalJake.CubikCore.Player;

public interface CubikOfflinePlayer{

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

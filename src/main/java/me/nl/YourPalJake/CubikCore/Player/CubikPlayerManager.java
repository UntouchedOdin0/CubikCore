package me.nl.YourPalJake.CubikCore.Player;

public interface CubikPlayerManager{

    /**
     * Create a new CubikPlayer instance
     *
     * @param name The username of the player
     */
    void createCubikPlayer(String name);


    CubikPlayer getCubikPlayer(String name);

    void removeCubikPlayer(String name);
}

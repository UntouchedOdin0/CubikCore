package me.nl.YourPalJake.CubikCore;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface CubikServer {

    /**
     * Returns the CubikPlayer Instance
     * <p>
     * Returns null if player isn't online,
     * or doesn't exist
     *
     * @param name The name of the player
     * @return The CubikPlayer instance
     */
    CubikPlayer getCubikPlayer(String name);

    /**
     * Returns the CubikPlayer instance
     *
     * @param uuid The UUID of the player
     * @return The CubikPlayer instance
     */
    CubikPlayer getCubikPlayer(UUID uuid);

    /**
     * Returns the CubikPlayer instance
     *
     * @param player The player instance
     * @return The CubikPlayer instance
     */
    CubikPlayer getCubikPlayer(Player player);

}

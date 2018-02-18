package me.nl.YourPalJake.CubikCore.Server;

import me.nl.YourPalJake.CubikCore.Player.CubikPlayer;
import me.nl.YourPalJake.CubikCore.Player.CubikPlayerManager;
import me.nl.YourPalJake.CubikCore.Plugin.CubikPluginManager;
import org.bukkit.entity.Player;

import java.util.UUID;

public interface CubikServer {

    /**
     * Set the CubikPluginManager
     *
     * @param cpm the CubikPluginManager instance
     */
    void setCubikPluginManger(CubikPluginManager cpm);

    /**
     * Set the CubikPlayerManager
     *
     * @param cpm the CubikPlayerManager instance
     */
    void setCubikPlayerManager(CubikPlayerManager cpm);

    /**
     * Get the CubikPluginManager instance
     *
     * @return CubikPluginManager instance
     */
    CubikPluginManager getCubikPluginManager();

    /**
     * Get the CubikPlayerManager instance
     *
     * @return CubikPlayerManager instance
     */
    CubikPlayerManager getCubikPlayerManager();

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

    /**
     * Checks if a CubikPlayer is online
     *
     * @param name The name of the player
     * @return true or false
     */
    boolean isCubikPlayerOnline(String name);

    /**
     * Checks if a CubikPlayer is online
     *
     * @param uuid The UUID of the player
     * @return true or false
     */
    boolean isCubikPlayerOnline(UUID uuid);



}

package me.nl.YourPalJake.CubikCore;

import java.util.HashMap;

public class CubikPlayerManager{

    private HashMap<String, CubikPlayer> cubikPlayerHashMap = new HashMap<>();

    /**
     * Get the CubikPlayer in the server
     *
     * @param name The name of the player
     * @return the CubikPlayer instance
     */
    public CubikPlayer getCubikPlayer(String name){
        return cubikPlayerHashMap.get(name);
    }

}

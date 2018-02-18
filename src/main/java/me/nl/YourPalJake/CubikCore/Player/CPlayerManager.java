package me.nl.YourPalJake.CubikCore.Player;

import java.util.HashMap;

public class CPlayerManager implements CubikPlayerManager{

    private HashMap<String, CubikPlayer> cubikPlayerHashMap = new HashMap<>();

    @Override
    public void createCubikPlayer(String name){
        //TODO get data and create new instance of CPlayer
        cubikPlayerHashMap.put(name, new CPlayer(name, name, false));
    }

    @Override
    public CubikPlayer getCubikPlayer(String name){
        return cubikPlayerHashMap.get(name);
    }

    @Override
    public void removeCubikPlayer(String name){
        //TODO save data
        cubikPlayerHashMap.remove(name);
    }

}

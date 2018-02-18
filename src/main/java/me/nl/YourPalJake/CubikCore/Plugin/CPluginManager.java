package me.nl.YourPalJake.CubikCore.Plugin;

import java.util.HashMap;

public class CPluginManager implements CubikPluginManager{

    private HashMap<String, CubikPlugin> cubikPluginHashMap = new HashMap<>();

    @Override
    public void registerCubikPlugin(CubikPlugin cubikPlugin, String name) {
        cubikPluginHashMap.put(name, cubikPlugin);
    }
}

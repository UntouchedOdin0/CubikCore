package me.nl.YourPalJake.CubikCore.Plugin;

import java.util.HashMap;

public class CPluginManager implements CubikPluginManager{

    private HashMap<String, CubikPlugin> cubikPluginHashMap = new HashMap<>();

    @Override
    public void registerCubikPlugin(String name, CubikPlugin cubikPlugin, boolean useCommandFile) {
        cubikPluginHashMap.put(name, cubikPlugin);
        if(useCommandFile){
            cubikPlugin.generateCommandFile();
        }

    }
}

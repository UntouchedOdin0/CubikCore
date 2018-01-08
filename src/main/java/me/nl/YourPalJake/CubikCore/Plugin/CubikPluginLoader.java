package me.nl.YourPalJake.CubikCore.Plugin;

import java.util.ArrayList;

public class CubikPluginLoader {

    private CubikPluginLoader(){}

    private static ArrayList<CubikPlugin> cubikPlugins = new ArrayList<>();

    public static void loadCubikPlugin(CubikPlugin cubikPlugin){
        cubikPlugins.add(cubikPlugin);
    }

    public static ArrayList<CubikPlugin> getCubikPlugins() {
        return cubikPlugins;
    }
}

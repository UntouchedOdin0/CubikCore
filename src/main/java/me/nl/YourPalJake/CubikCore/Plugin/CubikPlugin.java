package me.nl.YourPalJake.CubikCore.Plugin;

import org.bukkit.configuration.file.FileConfiguration;

public interface CubikPlugin {

    String getCubikPluginName();

    CubikPluginType getCubikPluginType();

    FileConfiguration getCommandFile();

    void saveCommandFile();


}

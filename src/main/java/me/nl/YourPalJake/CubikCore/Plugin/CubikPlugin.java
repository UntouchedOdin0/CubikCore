package me.nl.YourPalJake.CubikCore.Plugin;

import me.nl.YourPalJake.CubikCore.Command.CommandFile;
import org.bukkit.plugin.Plugin;

public interface CubikPlugin {

    String getName();

    Plugin getPlugin();

    void generateCommandFile();

    CommandFile getCommandFile();

}

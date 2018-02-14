package me.nl.YourPalJake.CubikCore.Command.CommandFile;

import java.util.List;

public interface CCommand {

    String getUsage();

    String getDescription();

    List<String> getAliases();

}

package me.nl.YourPalJake.CubikCore.Command;

import java.util.List;

public interface CCommand {

    /**
     * Returns if the command is enabled
     *
     * @return true or false
     */
    boolean isEnabled();

    /**
     * Get the commandName
     *
     * @return String with the command
     */
    String getCommand();

    /**
     * Get commandUsage
     *
     * @return String commandUsage
     */
    String getUsage();

    /**
     * Get command description
     *
     * @return String commandDescription
     */
    String getDescription();

    /**
     * Get commandAliases
     *
     * @return String List commandAliases
     */
    List<String> getAliases();

}

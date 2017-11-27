package me.nl.YourPalJake.CubikCore.Spigot.Vanish.StaffVanish;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class StaffVanishCmd implements CommandExecutor{


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof ConsoleCommandSender){

        }
        else if(sender instanceof Player){
            Player p = (Player)sender;

        }
        return true;
    }
}

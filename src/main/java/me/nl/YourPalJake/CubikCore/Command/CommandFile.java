package me.nl.YourPalJake.CubikCore.Command;

import me.nl.YourPalJake.CubikCore.Plugin.CubikPlugin;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.*;
import java.util.List;

public class CommandFile {


    private final File cfile;
    private final FileConfiguration commandFile;
    private final CubikPlugin cubikPlugin;


    public CommandFile(CubikPlugin cPlugin){
        this.cubikPlugin = cPlugin;
        if(!cPlugin.getPlugin().getDataFolder().exists()) cPlugin.getPlugin().getDataFolder().mkdir();
        this.cfile = new File(cPlugin.getPlugin().getDataFolder(), "commands.yml");
        if(!cfile.exists()){
            copy(cPlugin.getPlugin().getResource("commands.yml"), cfile);

        }
        this.commandFile = YamlConfiguration.loadConfiguration(cfile);
    }

    public FileConfiguration getCommandFile() {
        return this.commandFile;
    }

    public void saveFile(){
        try{
            commandFile.save(cfile);
        }catch (IOException e){
            e.printStackTrace();
            Bukkit.getLogger().severe("§4Could not save the commandFile of " + this.cubikPlugin.getName());
        }
    }

    public CCommand getCCommand(String commandPath){
        if(!commandFile.getString(commandPath).isEmpty()) {
            return new CCommand() {
                @Override
                public boolean isEnabled() {
                    return commandFile.getBoolean(commandPath + ".enabled");
                }

                @Override
                public String getCommand() {
                    return commandFile.getString(commandPath + ".command");
                }

                @Override
                public String getUsage() {
                    return commandFile.getString(commandPath + ".usage");
                }

                @Override
                public String getDescription() {
                    return commandFile.getString(commandPath + ".description");
                }

                @Override
                public List<String> getAliases() {
                    return commandFile.getStringList(commandPath + ".aliases");
                }
            };
        }
        Bukkit.getLogger().severe("Could not find command with path: " + commandPath + " in" + cubikPlugin.getName());
        return null;
    }

    private void copy(InputStream in, File file){
        try{
            OutputStream out = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int len;
            while((len=in.read(buf))>0){
                out.write(buf,0,len);
            }
            out.close();
            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

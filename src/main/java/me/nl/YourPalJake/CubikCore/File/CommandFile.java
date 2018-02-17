package me.nl.YourPalJake.CubikCore.File;

import me.nl.YourPalJake.CubikCore.Plugin.CubikPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.*;

public class CommandFile {


    private final File cfile;
    private final FileConfiguration commandFile;


    public CommandFile(CubikPlugin cPlugin){
        cfile = new File(cPlugin.getPlugin().getDataFolder(), "commands.yml");
        if(!cfile.exists()){
            copy(cPlugin.getPlugin().getResource("commands.yml"), cfile);
        }
        commandFile = YamlConfiguration.loadConfiguration(cfile);
    }

    public FileConfiguration getCommandFile() {
        return commandFile;
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

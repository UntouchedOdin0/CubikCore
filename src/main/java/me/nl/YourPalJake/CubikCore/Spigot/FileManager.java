package me.nl.YourPalJake.CubikCore.Spigot;

import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class FileManager {


    FileConfiguration config;
    File cfile;

    public void setup(Plugin p){
        cfile = new File(p.getDataFolder(), "config.yml");
        if(!cfile.exists()){
            cfile.getParentFile().mkdirs();
            copy(p.getResource("config.yml"), cfile);

        }

        config = new YamlConfiguration();
        loadConfig();

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

    public FileConfiguration getConfig() {
        return config;
    }

    public void saveConfig(){
        try{
            config.save(cfile);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void loadConfig(){
        try{
            config.load(cfile);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

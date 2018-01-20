package me.nl.YourPalJake.CubikCore.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.*;

public class CommandFile {

    private File cfile;
    private FileConfiguration commandFile;

    public void setup(Plugin plugin){

    }

    public FileConfiguration getCommandFile() {
        return commandFile;
    }

    public void saveCommandFile(){
        try{
            commandFile.save(cfile);
        }catch (IOException e){
            e.printStackTrace();
        }
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

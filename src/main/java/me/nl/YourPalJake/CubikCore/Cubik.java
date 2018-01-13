package me.nl.YourPalJake.CubikCore;

import me.nl.YourPalJake.CubikCore.Server.CubikServer;
import org.bukkit.Bukkit;

public final class Cubik {

    private static CubikServer cubikServer;

    private Cubik(){}

    public static void setCubikServer(CubikServer server){
        if(cubikServer != null){
            Bukkit.getLogger().severe("Cannot make a second instance of CubikServer");
        }else{
            cubikServer = server;
        }

    }

    public static CubikServer getCubikServer(){
        return cubikServer;
    }

}

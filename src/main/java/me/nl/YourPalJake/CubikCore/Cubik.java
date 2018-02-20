package me.nl.YourPalJake.CubikCore;

import me.nl.YourPalJake.CubikCore.Mojang.MojangAPI;
import me.nl.YourPalJake.CubikCore.Server.CubikServer;
import org.bukkit.Bukkit;

public final class Cubik {

    private static CubikServer cubikServer;
    private static MojangAPI mojangAPI;

    private Cubik(){}

    public static void setCubikServer(CubikServer server){
        if(cubikServer != null){
            Bukkit.getLogger().severe("Cannot make a second instance of CubikServer!");
        }else{
            cubikServer = server;
        }
    }

    public static void setMojangAPI(MojangAPI api){
        if(mojangAPI != null){
            Bukkit.getLogger().severe("Cannot make a second instance of MojangAPI!");
        }else{
            mojangAPI = api;
        }
    }

    public static CubikServer getCubikServer(){
        return cubikServer;
    }

}

package me.nl.YourPalJake.CubikCore.Mojang;

import org.bukkit.Bukkit;
import org.shanerx.mojang.Mojang;

public class MojangCore {

    private static Mojang mojangAPI;

    private MojangCore(){}

    public static void setup(){
        mojangAPI = new Mojang().connect();
        if(mojangAPI.getStatus(Mojang.ServiceType.AUTH_MOJANG_COM) != Mojang.ServiceStatus.GREEN){
            Bukkit.getLogger().severe("Cannot connect to the Mojang Auth servers! This can be a big issue");
        }


    }

    public static Mojang getMojangAPI(){
        return mojangAPI;
    }


}

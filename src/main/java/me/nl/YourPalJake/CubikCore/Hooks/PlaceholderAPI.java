package me.nl.YourPalJake.CubikCore.Hooks;

import me.clip.placeholderapi.external.EZPlaceholderHook;
import me.nl.YourPalJake.CubikCore.CCCore;
import me.nl.YourPalJake.CubikCore.Cubik;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class PlaceholderAPI extends EZPlaceholderHook implements Listener {

    private CCCore ccc;

    public PlaceholderAPI(CCCore ccCore){
        super(ccCore, "cubik");
        this.ccc = ccCore;
    }

    public void onLoad(){
        if(Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")){
            Bukkit.getLogger().info("§bCubikCore §7> PlaceholderAPI found registering placeholders....");
            this.hook();
        }else {
            Bukkit.getLogger().info("§bCubikCore §7> Didn't found dependency PlaceholderAPI (Not recommended),");
            Bukkit.getLogger().info("Install the latest version of PlaceHolderAPI, because if you do not we will not");
            Bukkit.getLogger().info("Support placeholders!");
        }
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {
        if(player == null) return null;

        //CustomName placeholder
        if(identifier.equals("custom_name")) return Cubik.getCubikServer().getCubikPlayer(player).getCustomName();

        return null;
    }
}

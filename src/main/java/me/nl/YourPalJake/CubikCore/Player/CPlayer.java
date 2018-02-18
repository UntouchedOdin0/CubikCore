package me.nl.YourPalJake.CubikCore.Player;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class CPlayer implements CubikPlayer{
    private String name;
    private Player player;
    private String customName;
    private boolean frozen;

    public CPlayer(String name, String customName, boolean frozen){
        this.player = Bukkit.getServer().getPlayer(name);
        this.customName = customName;
        this.frozen = frozen;
    }

    @Override
    public Player getPlayer() {
        return this.player;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setCustomName(String name) {
        this.customName = name;
    }

    @Override
    public String getCustomName() {
        return this.customName;
    }

    @Override
    public boolean hasCustomName(){
        if(this.name.equals(this.customName)){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    @Override
    public boolean isFrozen() {
        return this.frozen;
    }
}

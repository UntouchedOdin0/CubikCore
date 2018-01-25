package me.nl.YourPalJake.CubikCore.Player;

import org.bukkit.entity.Player;

public class CPlayer implements CubikPlayer{
    private String name;

    public CPlayer(String name){

    }

    @Override
    public Player getPlayer() {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setCustomName(String name) {

    }

    @Override
    public String getCustomName() {
        return null;
    }

    @Override
    public void setFrozen(boolean frozen) {

    }

    @Override
    public boolean isFrozen() {
        return false;
    }
}

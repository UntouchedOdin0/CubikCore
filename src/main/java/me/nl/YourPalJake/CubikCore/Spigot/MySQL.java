package me.nl.YourPalJake.CubikCore.Spigot;

import org.bukkit.Bukkit;

import java.sql.*;

public class MySQL {

    FileManager filem = new FileManager();

    private Connection connection;
    private String host, database, username, password;
    private int port;

    public void setupConnection(){
        host = filem.getConfig().getString("mysql.host");
        port = filem.getConfig().getInt("mysql.port");
        database = filem.getConfig().getString("mysql.database");
        username = filem.getConfig().getString("mysql.username");
        password = filem.getConfig().getString("mysql.password");

        Bukkit.getServer().getLogger().info(host + " " + port + " " + database + " " + username + " " + password);

    }
}

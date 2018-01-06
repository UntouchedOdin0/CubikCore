package me.nl.YourPalJake.CubikCore.Utils;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URL;

public class MojangAPI {

    /**
     * Get the UUID from the MojangAPI
     *
     * @param name The name of the player who's UUID you wanna get
     * @return The UUID of the player you defined
     */
    @SuppressWarnings("deprecation")
    public String getUUID(String name){
        String url = "https://api.mojang.com/users/profiles/minecraft/"+name;
        try{
            String UUIDJson = IOUtils.toString(new URL(url));
            if(UUIDJson.isEmpty()) return "invalid";
            JSONObject UUIDObject = (JSONObject) JSONValue.parseWithException(UUIDJson);
            return UUIDObject.get("id").toString();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
        return "error";
    }



}

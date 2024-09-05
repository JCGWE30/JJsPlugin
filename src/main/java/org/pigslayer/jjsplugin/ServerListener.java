package org.pigslayer.jjsplugin;

import org.bukkit.Bukkit;

import java.util.Arrays;

import static spark.Spark.*;

public class ServerListener {
    public static void startServer(){
        port(8060);

        post("/message",(request,response) -> {
            String[] info = request.body().split(",");
            String user = info[0];
            String commit = info[1];
            Arrays.stream(new String[]{
                    "§e[JJs Pack] §aThe server texture pack has been modified!",
                    "§eModified by: §a"+user,
                    "§eChanges: §a"+commit,
                    "§eRejoin the server to experience these changes!"
            }).forEach(Bukkit::broadcastMessage);
            return "Understood";
        });

    }
}

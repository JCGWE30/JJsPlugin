package org.pigslayer.jjsplugin;

import org.bukkit.Bukkit;
import static spark.Spark.*;

public class ServerListener {
    public static void startServer(){
        port(26143);

        post("/message",(request,response) -> {
            String message = request.body();
            Bukkit.getOnlinePlayers().forEach((p) -> p.sendMessage(message));
            return "Understood";
        });

    }
}

package org.pigslayer.jjsplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class JJsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        ServerListener.startServer();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

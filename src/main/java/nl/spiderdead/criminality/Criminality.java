package nl.spiderdead.criminality;

import org.bukkit.plugin.java.JavaPlugin;

public class Criminality extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Criminality has been loaded!");
    }
    @Override
    public void onDisable() {
        getLogger().info("Criminality has been unloaded...");
    }
}

package net.fathomtech.minecraft.plugin.City;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Booting up City Plugin.");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("Disabling City Plugin.");
    }
}

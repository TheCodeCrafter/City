package net.fathomtech.minecraft.plugin.City;

import java.util.WeakHashMap;

import net.fathomtech.minecraft.plugin.City.Commands.PhoneCommand;
import net.fathomtech.minecraft.plugin.City.GUI.PhoneGUI;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    
    public WeakHashMap<Player, PhoneGUI> phones = new WeakHashMap<Player, PhoneGUI>();
    
    @Override
    public void onEnable() {
        getLogger().info("Booting up City Plugin.");
        
        // Go through database and add phones or each player
        
        // Register Commands
        this.getCommand("phone").setExecutor(new PhoneCommand(this, phones));
    }
    
    @Override
    public void onDisable() {
        getLogger().info("Disabling City Plugin.");
    }
}

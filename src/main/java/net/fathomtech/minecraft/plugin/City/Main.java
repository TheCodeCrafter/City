package net.fathomtech.minecraft.plugin.City;

import java.util.WeakHashMap;

import net.fathomtech.minecraft.plugin.City.Commands.PhoneCommand;
import net.fathomtech.minecraft.plugin.City.GUI.PhoneGUI;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    
    public WeakHashMap<Player, PhoneGUI> phones = new WeakHashMap<Player, PhoneGUI>();
    
    public ZoneList ZoneList = new ZoneList(this);
    
    @Override
    public void onEnable() {
        getLogger().info("Booting up City Plugin.");
        
        // Go through database and add phones or each player
        
        //// Add Zones ////
        
        //ZoneList.addZone(ZoneType.CONSTRUCTION, database.get(constructionZones));
        //ZoneList.addZone(ZoneType.COMMERCIAL, database.get(commercialZones));
        //ZoneList.addZone(ZoneType.RESIDENTIAL, database.get(residentialZones));
        //ZoneList.addZone(ZoneType.INDUSTRIAL, database.get(industrialZones));
        
        
        // Register Commands
        this.getCommand("phone").setExecutor(new PhoneCommand(this, phones));
    }
    
    @Override
    public void onDisable() {
        getLogger().info("Disabling City Plugin.");
    }
}

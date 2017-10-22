package net.fathomtech.minecraft.plugin.City.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import net.fathomtech.minecraft.plugin.City.ItemSmith;
import net.fathomtech.minecraft.plugin.City.Main;
import net.fathomtech.minecraft.plugin.City.GUI.Apps.App;

public class PhoneGUI {
    
    static Main plugin;
    static Player owner;
    public PhoneGUI(Main p, Player o) {
        plugin = p;
        owner = o;
    }
    
    private static ItemSmith smith = new ItemSmith(plugin);
    public static Inventory home = Bukkit.createInventory(null, 54, (ChatColor.BLUE + "" + ChatColor.BOLD + "Phone"));
    
    static {
        // Hotbar
        home.setItem(0, smith.Messages());
        home.setItem(9, smith.Calls());
        home.setItem(18, smith.Home());
        home.setItem(27, smith.People());
        home.setItem(36, smith.Browser());
        
    }
    
    public void homepage(Player p) {
        p.openInventory(home);
    }
    
    public void openApp(Player player, App app) {
        app.open(player);
    }
}

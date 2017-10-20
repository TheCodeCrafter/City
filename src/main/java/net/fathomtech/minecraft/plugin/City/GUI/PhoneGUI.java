package net.fathomtech.minecraft.plugin.City.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import net.fathomtech.minecraft.plugin.City.ItemSmith;
import net.fathomtech.minecraft.plugin.City.Main;

public class PhoneGUI {
    
    static Main plugin;
    static Player owner;
    public PhoneGUI(Main p, Player o) {
        plugin = p;
        owner = o;
    }
    
    private static ItemSmith smith = new ItemSmith(plugin);
    private static Inventory phone = Bukkit.createInventory(null, 54, (ChatColor.BLUE + "" + ChatColor.BOLD + owner.getName() + "'s Phone"));
    
    static {
        
    }
    
    public void show(Player p) {
        p.openInventory(phone);
    }
}

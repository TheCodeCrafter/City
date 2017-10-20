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
    private static Inventory phone = Bukkit.createInventory(null, 54, (ChatColor.BLUE + "" + ChatColor.BOLD + "Phone"));
    
    static {
        // Column One
        phone.setItem(0, smith.Messages());
        phone.setItem(9, smith.Calls());
        phone.setItem(18, smith.Home());
        phone.setItem(27, smith.People());
        phone.setItem(36, smith.Browser());
    }
    
    public void show(Player p) {
        p.openInventory(phone);
    }
}

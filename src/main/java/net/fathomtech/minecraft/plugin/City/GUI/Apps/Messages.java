package net.fathomtech.minecraft.plugin.City.GUI.Apps;

import net.fathomtech.minecraft.plugin.City.ItemSmith;
import net.fathomtech.minecraft.plugin.City.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Messages extends App {
    
    static Main plugin;
    
    public Messages(Main p) {
        super();
        plugin = p;
    }
    
    public int id = 1;
    public static String name = (ChatColor.GREEN + "Messages");
    public static Inventory page = Bukkit.createInventory(null, 3, name);
    
    static {
        page.setItem(0, ItemSmith.Messages.NewMessage());
        page.setItem(1, ItemSmith.Messages.Conversations());
        page.setItem(2, ItemSmith.Messages.Settings());
    }
    
    public static class Conversations {
        public static Inventory page = Bukkit.createInventory(null, 36, "Conversations");
        
        static {
            // Set Conversations (From Database)
        }
    }
    
    public static class Settings {
        public static Inventory page = Bukkit.createInventory(null, 3, "Settings");
        
        static {
            // TODO: Add Settings Items
        }
    }
    
    public void conversations(Player p) {
        p.openInventory(Conversations.page);
    }
    
    public void settings(Player p) {
        p.openInventory(Settings.page);
    }
    
    
}

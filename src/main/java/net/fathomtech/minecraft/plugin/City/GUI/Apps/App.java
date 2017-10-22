package net.fathomtech.minecraft.plugin.City.GUI.Apps;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class App {
    public Inventory page;
    public String name;
    public int id;
    
    public App() {}
    
    public void open(Player p) {
        p.openInventory(page);
    }
    
    public void close(Player p) {
        p.closeInventory();
    }
}

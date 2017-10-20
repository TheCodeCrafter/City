package net.fathomtech.minecraft.plugin.City.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import net.fathomtech.minecraft.plugin.City.ItemSmith;
import net.fathomtech.minecraft.plugin.City.Main;

public class WalletGUI {
    static Main plugin;
    static Player owner;
    public WalletGUI(Main p, Player o) {
        plugin = p;
        owner = o;
    }
    
    private static ItemSmith smith = new ItemSmith(plugin);
    private static Inventory wallet = Bukkit.createInventory(owner, 3, (ChatColor.GREEN + "" + ChatColor.BOLD + "Wallet"));
    
    static {
        wallet.setItem(0, smith.Cash());
        wallet.setItem(1, smith.Cards());
        wallet.setItem(2, smith.Receipts());
    }
    
    public void show(Player p) {
        p.openInventory(wallet);
    }
}

package net.fathomtech.minecraft.plugin.City;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemSmith {
    
    Main plugin;
    
    public ItemSmith(Main p) {
        plugin = p;
    }
    
    public ItemStack Dollar(int type) {
        ItemStack dollar = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = dollar.getItemMeta();
        
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "The currency you will use");
        lore.add(ChatColor.GRAY + "to purchase/barter in the city");
        
        if(type > 1) {
            meta.setDisplayName(ChatColor.GREEN + "" + type + " Dollars");
        } else {
            meta.setDisplayName(ChatColor.GREEN + "" + type + " Dollar");
        }
        
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        
        dollar.setItemMeta(meta);
        
        return dollar;
    }
    
    public ItemStack Dollar(int type, int amount) {
        ItemStack dollar = new ItemStack(Material.PAPER, amount);
        ItemMeta meta = dollar.getItemMeta();
        
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "The currency you will use");
        lore.add(ChatColor.GRAY + "to purchase/barter in the city");
        
        meta.setLore(lore);
        
        if(type > 1) {
            meta.setDisplayName(ChatColor.GREEN + "" + type + " Dollars");
        } else {
            meta.setDisplayName(ChatColor.GREEN + "" + type + " Dollar");
        }
        
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        
        dollar.setItemMeta(meta);
                
        return dollar;
    }
    
    public ItemStack Cash() {
        ItemStack cash = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = cash.getItemMeta();
        
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.WHITE + "Your cash");
        
        meta.setLore(lore);
        
        meta.setDisplayName(ChatColor.GREEN + "Cash");
        
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        
        return cash;
    }
    
    public ItemStack Cards() {
        ItemStack cards = new ItemStack(Material.BOOK, 1);
        ItemMeta meta = cards.getItemMeta();
        
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.WHITE + "Your credit/debit cards");
        
        meta.setLore(lore);
        
        meta.setDisplayName(ChatColor.BLUE + "Cards");
        
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        
        cards.setItemMeta(meta);
        
        return cards;
    }
    
    public ItemStack Receipts() {
        ItemStack receipts = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = receipts.getItemMeta();
        
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.WHITE + "Your receipts for your cash purchases.");
        
        meta.setLore(lore);
        
        meta.setDisplayName(ChatColor.WHITE + "Receipts");
        
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        
        receipts.setItemMeta(meta);
        
        return receipts;
    }
}

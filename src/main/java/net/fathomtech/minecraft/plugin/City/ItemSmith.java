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
    
    
    public ItemStack Messages() {
        ItemStack messages = new ItemStack(Material.WOOD_SWORD, 1, (short)1);
        ItemMeta meta = messages.getItemMeta();
        
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.WHITE + "Messages with Players");
        
        meta.setLore(lore);
        
        meta.setDisplayName(ChatColor.WHITE + "Messages");
        
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        
        messages.setItemMeta(meta);
        
        return messages;
    }
    
    public ItemStack Calls() {
        ItemStack calls = new ItemStack(Material.SPONGE, 1, (short)2);
        ItemMeta meta = calls.getItemMeta();
        
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.WHITE + "Dedicated Chats with Players");
        
        meta.setLore(lore);
        
        meta.setDisplayName(ChatColor.WHITE + "Calling");
        
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        
        calls.setItemMeta(meta);
        
        return calls;
    }
    
    public ItemStack Home() {
        ItemStack home = new ItemStack(Material.WOOD_SWORD, 1, (short)3);
        ItemMeta meta = home.getItemMeta();
        
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.WHITE + "Return to Homepage");
        
        meta.setLore(lore);
        
        meta.setDisplayName(ChatColor.WHITE + "Home");
        
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        
        home.setItemMeta(meta);
        
        return home;
    }
    
    public ItemStack People() {
        ItemStack people = new ItemStack(Material.WOOD_SWORD, 1, (short)4);
        ItemMeta meta = people.getItemMeta();
        
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.WHITE + "Your Saved Contacts");
        
        meta.setLore(lore);
        
        meta.setDisplayName(ChatColor.WHITE + "People");
        
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        
        people.setItemMeta(meta);
        
        return people;
    }
    
    public ItemStack Browser() {
        ItemStack browser = new ItemStack(Material.WOOD_SWORD, 1, (short)5);
        ItemMeta meta = browser.getItemMeta();
        
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.WHITE + "Browse the Internet");
        
        meta.setLore(lore);
        
        meta.setDisplayName(ChatColor.WHITE + "Browser");
        
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        
        browser.setItemMeta(meta);
        
        return browser;
    }
    
}

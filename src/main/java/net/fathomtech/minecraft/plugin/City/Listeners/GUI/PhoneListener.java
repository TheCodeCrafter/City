package net.fathomtech.minecraft.plugin.City.Listeners.GUI;

import net.fathomtech.minecraft.plugin.City.ItemSmith;
import net.fathomtech.minecraft.plugin.City.GUI.PhoneGUI;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.ItemStack;

public class PhoneListener implements Listener {
    
    ItemSmith smith = new ItemSmith();
    
    @EventHandler
    public void onPhoneTouch(InventoryClickEvent event) {
        // HOMEPAGE
        if(event.getInventory().getName().equalsIgnoreCase(PhoneGUI.home.getName()) && event.getSlotType() != SlotType.OUTSIDE) {
            ItemStack clicked = event.getCurrentItem();
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);
            
            if(clicked.equals(smith.Messages())) {
                
            } else if(clicked.equals(smith.Calls())) {
                
            } else if(clicked.equals(smith.People())) {
                
            } else if(clicked.equals(smith.Browser())) {
                
            } else {
                return;
            }
        }
    }
}

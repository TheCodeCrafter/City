package net.fathomtech.minecraft.plugin.City.Listeners;

import net.fathomtech.minecraft.plugin.City.Main;
import net.fathomtech.minecraft.plugin.City.ZoneList;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockListener implements Listener {
    
    Main plugin;
    
    public BlockListener(Main p) {
        plugin = p;
    }
    
    ZoneList ZoneList = plugin.ZoneList;
    
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        // Check if block is placeable (Make sure it's not an in-game item)
        
        // If the player is an Admin let the event pass
        if(event.getPlayer().hasPermission("City.Block.Break")) {
            event.setCancelled(false);
            return;
        }
        
        // So the player isn't an admin, check if the block is in a construction zone
        if(ZoneList.inConstructionZone(event.getBlock())) {
            // Okay, so the block is in a construction zone, is the player a construction worker?
            if(!event.getPlayer().hasPermission("City.Jobs.Construction")) {
                // So the player isn't a construction worker!
                event.getPlayer().sendMessage(ChatColor.RED + "You must be a Construction Worker to alter this structure!");
                event.setCancelled(true);
                return;
            }
        }
    }
}

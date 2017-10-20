package net.fathomtech.minecraft.plugin.City.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class PlayerListener implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        // Check if block is placeable (Make sure it's not an in-game item)
        
        // Check if it's not in a construction zone
        if(ZoneList.Construction.contains(event.getBlock())) {
            if(!event.getPlayer().hasPermission("City.Jobs.Construction")) {
                event.getPlayer().sendMessage(ChatColor.RED + "You must be a Construction Worker to alter this structure!");
                event.setCancelled(true);
            }
        } else {
            if(!event.getPlayer().hasPermission("City.Block.Break")) {
                event.setCancelled(true);
            }
        }
    }
}

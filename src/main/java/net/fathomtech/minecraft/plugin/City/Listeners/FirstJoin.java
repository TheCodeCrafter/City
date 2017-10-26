package net.fathomtech.minecraft.plugin.City.Listeners;

import net.fathomtech.minecraft.plugin.City.Main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class FirstJoin implements Listener {
    
    Main Plugin;
    
    public FirstJoin(Main p) {
        Plugin = p;
    }
    
    @EventHandler
    public void onPlayerFirstJoin(PlayerJoinEvent event) {
        Plugin
    }
}

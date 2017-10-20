package net.fathomtech.minecraft.plugin.City.Zones;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.block.Block;

public class Zone {
    private ArrayList<Location> zone = new ArrayList<Location>();
    
    public boolean contains(Block block) {
        if(zone.contains(block.getLocation())) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(Location location) {
        zone.add(location);
    }
    
    public void remove(Location location) {
        zone.remove(location); 
    }
}

package net.fathomtech.minecraft.plugin.City.NPC;

import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.trait.Trait;
import net.citizensnpcs.api.trait.TraitName;
import net.citizensnpcs.api.util.DataKey;
import net.fathomtech.minecraft.plugin.City.Main;
import net.fathomtech.minecraft.plugin.City.Buildings.Home;

@TraitName("Pedestrian")
public class Pedestrian extends Trait {

    protected Pedestrian(String name, Job j, Personality p, Home h) {
        super(name);
        plugin = JavaPlugin.getPlugin(Main.class);
        
        job = j;
        personality = p;
        home = h;
        
    }
    
    Main plugin = null;
    public Job job = null;
    public Personality personality = null;
    public Home home = null;
    
    public void load(DataKey key) {
        
    }
    
    public void save(DataKey key) {
        
    }
    
    @Override
    public void run() {
        
    }
    
    @Override
    public void onAttach() {
        plugin.getServer().getLogger().info("[NPC] " + npc.getName() + " has been configured.");
    }
    
    @EventHandler
    public void onInteract(NPCRightClickEvent event) {
        if(event.getNPC().equals(this.getNPC())) {
            
        }
    }
    
    @Override
    public void onDespawn() {
        
    }
    
    @Override
    public void onSpawn() {
        
    }
    
    @Override
    public void onRemove() {
        
    }
}
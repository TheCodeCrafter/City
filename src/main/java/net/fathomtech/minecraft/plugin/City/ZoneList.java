package net.fathomtech.minecraft.plugin.City;

import java.util.ArrayList;

import org.bukkit.block.Block;

import net.fathomtech.minecraft.plugin.City.Zones.*;

public class ZoneList {
    
    Main plugin;
    
    public ArrayList<ConstructionZone> constructionZones = new ArrayList<ConstructionZone>();
    public ArrayList<CommercialZone> commercialZones = new ArrayList<CommercialZone>();
    public ArrayList<ResidentialZone> residentialZones = new ArrayList<ResidentialZone>();
    public ArrayList<IndustrialZone> industrialZones = new ArrayList<IndustrialZone>();
    
    public ZoneList(Main p) {
        plugin = p;
 
    }
    
    public void addZone(ZoneType type, Zone zone) {
        if(type.equals(ZoneType.CONSTRUCTION)) {
            ConstructionZone construction = (ConstructionZone) zone;
            constructionZones.add(construction);
        } else if(type.equals(ZoneType.COMMERCIAL)) {
            CommercialZone commercial = (CommercialZone) zone;
            commercialZones.add(commercial);
        } else if(type.equals(ZoneType.RESIDENTIAL)) {
            ResidentialZone residential = (ResidentialZone) zone;
            residentialZones.add(residential);
        } else if(type.equals(ZoneType.INDUSTRIAL)) {
            IndustrialZone industrial = (IndustrialZone) zone;
            industrialZones.add(industrial);
        } else {
            plugin.getLogger().warning("The ZoneType passed couldn't be found");
        }
    }
    
    public boolean inConstructionZone(Block block) {
        for(ConstructionZone zone : constructionZones) {
            if(zone.contains(block)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean inCommercialZone(Block block) {
        for(CommercialZone zone : commercialZones) {
            if(zone.contains(block)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean inResidentialZone(Block block) {
        for(ResidentialZone zone : residentialZones) {
            if(zone.contains(block)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean inIndustrialZone(Block block) {
        for(ConstructionZone zone : constructionZones) {
            if(zone.contains(block)) {
                return true;
            }
        }
        return false;
    }
}

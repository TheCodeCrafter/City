package net.fathomtech.minecraft.plugin.City;

import java.util.ArrayList;

import net.fathomtech.minecraft.plugin.City.Zones.Zone;

public class Address {
    public String address;
    
    public int number;
    public String street;
    
    public Zone zone;
    public ArrayList<Object> data;
    
    public Address(String a) {
        address = a;
        String[] b = a.split(" ");
        if(b.length == 2) {
            number = Integer.parseInt(b[0]);
            street = b[1];
        } else {
            for(int i = 0; i < b.length; i++) {
                if(i == 0) {
                    number = Integer.parseInt(b[i]);
                    return;
                }
                street.concat(b[i] + " ");
            }
        }
    }
    
    
    public Address(String a, Zone z, ArrayList<Object> d) {
        address = a;
        zone = z;
        data = d;
    }
}

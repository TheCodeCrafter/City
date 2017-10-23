package net.fathomtech.minecraft.plugin.City;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.WeakHashMap;

import net.fathomtech.minecraft.plugin.City.Commands.PhoneCommand;
import net.fathomtech.minecraft.plugin.City.GUI.PhoneGUI;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    
    public WeakHashMap<Player, PhoneGUI> phones = new WeakHashMap<Player, PhoneGUI>();
    
    private Connection connection;
    private String host, database, username, password;
    private int port;
    
    public ZoneList ZoneList = new ZoneList(this);
    
    @Override
    public void onEnable() {
        getLogger().info("Checking Citizens 2.0 Dependency...");
        if(getServer().getPluginManager().getPlugin("Citizens") == null || getServer().getPluginManager().getPlugin("Citizens").isEnabled() == false) {
			getLogger().severe("Citizens 2.0 not found or not enabled");
			getServer().getPluginManager().disablePlugin(this);	
			return;
		}
		
		getLogger().info("Assigning Database Variables...");
		host = "database.fathomcraft.com";
        port = 3306;
        database = "CityDatabase";
        username = "root";
        password = "123";
        
        getLogger().info("Attempting Connection to Database...");
        try {     
            openConnection();
            Statement statement = connection.createStatement();          
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            getLogger().severe(e.getMessage());
            return;
        } catch (SQLException e) {
            e.printStackTrace();
            getLogger().severe(e.getMessage());
            return;
        }
		
		
        
        // Go through database and add phones or each player
        
        //// Add Zones ////
        
        //ZoneList.addZone(ZoneType.CONSTRUCTION, database.get(constructionZones));
        //ZoneList.addZone(ZoneType.COMMERCIAL, database.get(commercialZones));
        //ZoneList.addZone(ZoneType.RESIDENTIAL, database.get(residentialZones));
        //ZoneList.addZone(ZoneType.INDUSTRIAL, database.get(industrialZones));
        
        
        // Register Commands
        this.getCommand("phone").setExecutor(new PhoneCommand(this, phones));
    }
    
    @Override
    public void onDisable() {
        getLogger().info("Disabling City Plugin.");
    }
    
    public void openConnection() throws SQLException, ClassNotFoundException {
        if (connection != null && !connection.isClosed()) {
            return;
        }
     
        synchronized (this) {
            if (connection != null && !connection.isClosed()) {
                return;
            } 
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + this.host+ ":" + this.port + "/" + this.database, this.username, this.password);
        }
    }
}

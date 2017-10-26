package net.fathomtech.minecraft.plugin.City.Admin;

import java.sql.SQLException;

import net.fathomtech.minecraft.plugin.City.Main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CityCommand implements CommandExecutor {
    
    Main plugin;
    
    public CityCommand(Main p) {
        plugin = p;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("city")) {
            if(args.length == 0) {
                sender.sendMessage(ChatColor.WHITE + "----------------");
                sender.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "      City:");
                sender.sendMessage(ChatColor.WHITE + "----------------");
                sender.sendMessage(ChatColor.GREEN + "Usages: ");
                sender.sendMessage(ChatColor.WHITE + "/city outfits <player> <add/remove> <outfit name/id>");
                sender.sendMessage(ChatColor.WHITE + "/city money <player> <bank/cash> <add/sub/set> <amount>");
                sender.sendMessage(ChatColor.WHITE + "/city home <player> <set/info/tp>");
                sender.sendMessage(ChatColor.WHITE + "/city outfit <player> <change/takeoff/info> <outfit>");
                sender.sendMessage(ChatColor.WHITE + "/city boat <player> <info/add/remove> <boat>");
                sender.sendMessage(ChatColor.WHITE + "/city plane <player> <info/add/remove> <plane>");
                sender.sendMessage(ChatColor.WHITE + "/city address <add/remove/change> <address> <location>");
                sender.sendMessage(ChatColor.WHITE + "/city home <add/remove/change> <bed>");
                sender.sendMessage(ChatColor.WHITE + "/city gift <player> <gift>");
                sender.sendMessage(ChatColor.WHITE + "/city rank <player> <rank>");
                sender.sendMessage(ChatColor.WHITE + "/city staff <player> <staffRank>");
                sender.sendMessage(ChatColor.WHITE + "/city chat <clear/log> <all/links>");
                sender.sendMessage(ChatColor.WHITE + "/city npc <info/tp> <id/name>");
                return true;
            }
            if(args.length >= 1) {
                switch(args[0].toLowerCase()) {
                    case "address":
                        if(args.length == 1) {
                            sender.sendMessage(ChatColor.DARK_PURPLE + "Usage: " + ChatColor.WHITE + "/city address <name> <location>");
                            sender.sendMessage(ChatColor.GREEN + "Use this to register an address within our database. If you don't specify a location then it will use your current location.");
                            return true;
                        }
                        
                        if(args.length == 2) {
                            if(sender instanceof Player) {
                                Player player = (Player) sender;
                                try {
                                    plugin.registerAddress(args[0], player.getLocation());
                                } catch(SQLException exception) {
                                    player.sendMessage(ChatColor.RED + "There was a problem with the database! Check the logs for errors!");
                                    plugin.getLogger().warning(exception.getMessage());
                                    return false;
                                } catch(ClassNotFoundException exception) {
                                    player.sendMessage(ChatColor.RED + "There was an error attempting to call the database! Check the logs for errors!");
                                    plugin.getLogger().warning(exception.getMessage());
                                    return false;
                                } catch (Exception exception) {
                                    player.sendMessage(ChatColor.RED + "Plugin Error!!! Report this or check the logs!");
                                    plugin.getLogger().warning(exception.getMessage());
                                    return false;
                                }
                                player.sendMessage(ChatColor.GREEN + "Address successfully registered in the database!");
                                return true;
                            }
                            sender.sendMessage(ChatColor.RED + "You must specify a location if you aren't a player!");
                            return false;
                        }
                        sender.sendMessage(ChatColor.RED + "Unrecognized Arguments!");
                        return false;
                }
            }
            sender.sendMessage(ChatColor.RED + "Unrecognized Arguments!");
            return false;
        }
        sender.sendMessage(ChatColor.RED + "Unrecognized Command!");
        return false;
    }
}

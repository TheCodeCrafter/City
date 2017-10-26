package net.fathomtech.minecraft.plugin.City.Admin;

import net.fathomtech.minecraft.plugin.City.Main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

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
            return false;
        }
        sender.sendMessage(ChatColor.RED + "Unrecognized Command!");
        return false;
    }
}

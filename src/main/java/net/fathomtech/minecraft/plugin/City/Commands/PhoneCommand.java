package net.fathomtech.minecraft.plugin.City.Commands;

import java.util.WeakHashMap;

import net.fathomtech.minecraft.plugin.City.Main;
import net.fathomtech.minecraft.plugin.City.GUI.PhoneGUI;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PhoneCommand implements CommandExecutor {
    
    public Main plugin;
    WeakHashMap<Player, PhoneGUI> phones;
    
    public PhoneCommand(Main p, WeakHashMap<Player, PhoneGUI> ph) {
        plugin = p;
        phones = ph;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("phone")) {
            if(sender instanceof Player) {
                Player player = (Player) sender;
                
                if(args.length == 0) {
                    PhoneGUI phone = phones.get(player);
                    phone.show(player);
                    return true;
                }
                
                if(args.length == 1) {
                    if(player.hasPermission("City.Admin.Phone")) {
                        @SuppressWarnings("deprecation")
                        PhoneGUI phone = phones.get(plugin.getServer().getPlayer(args[0]));
                        phone.show(player);
                        player.sendMessage(ChatColor.YELLOW + "Now viewing " + args[0] + "'s phone");
                        return true;
                    } else {
                        player.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
                        return false;
                    }
                }
            }
            sender.sendMessage("You must be a player to open a phone!");
            return false;
        }
        return false;
    }
}

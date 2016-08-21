package net.spacegeek224.metrobukkit.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import net.spacegeek224.metrobukkit.MetroPlugin;

public class CommandGoTo implements CommandExecutor {
	
	public FileConfiguration config;
	
	public CommandGoTo(MetroPlugin p) {
		config = p.getConfig();
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage("Sending you to..."+config.getString("goto.location1.x"));
			
			// Here we need to give items to our player
		} else {
			sender.sendMessage("Sending you to..."+config.getConfigurationSection("goto.location1").getCurrentPath());
		}
		// If the player (or console) uses our command correct, we can return
		// true
		return true;
	}


}

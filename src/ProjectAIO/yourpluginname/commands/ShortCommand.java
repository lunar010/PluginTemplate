package ProjectAIO.yourpluginname.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ProjectAIO.yourpluginname.Main;

public class ShortCommand implements CommandExecutor {

	public Main plugin;
	public ShortCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("command").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender executor, Command cmd, String label, String[] args) {
		if(!(executor instanceof Player)) { 
			return true; 
		} else if (cmd.getName().equalsIgnoreCase("command")){ 
			executor.sendMessage("");
			executor.sendMessage("Short Command"); 
			executor.sendMessage("");
		}
		return false;
	}
	
}

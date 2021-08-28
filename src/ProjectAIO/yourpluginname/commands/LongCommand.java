package ProjectAIO.yourpluginname.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ProjectAIO.yourpluginname.Main;

public class LongCommand implements CommandExecutor {

	@SuppressWarnings("unused")
	private Main plugin;
	
	public LongCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("command").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender executor, Command cmd, String label, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("command")) {
			if (args.length > 0 && args[0].equalsIgnoreCase("long")) {
				if(executor.hasPermission("long.long")){
					Player p = (Player) executor;
					p.getPlayer().setHealth(10);
					executor.sendMessage(" ");
					executor.sendMessage("Long Command");
					executor.sendMessage(" ");
				} else {
					executor.sendMessage(" ");
					executor.sendMessage("You don't have permission");
					executor.sendMessage(" ");
				}
			}
		}
		return true;
	}
	
}

package ProjectAIO.yourpluginname;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import ProjectAIO.yourpluginname.listener.ItemSpawnListener;
import ProjectAIO.yourpluginname.listener.JoinListener;
import ProjectAIO.yourpluginname.listener.LeaveListener;
import ProjectAIO.yourpluginname.listener.MobSpawnListener;
import ProjectAIO.yourpluginname.utils.DiscordWebhook;
import ProjectAIO.yourpluginname.utils.Netty;

public class Main extends JavaPlugin implements Listener {

	private static Main instance;
	@SuppressWarnings("unused")
	private ConsoleCommandSender logger = Bukkit.getConsoleSender();
	public String getName = "YourPluginName";
	public String getWebhookURL = "YourWebhookURL";

	public static Main getInstance() {
		return instance;
	}
	
	@Override
	public void onEnable() {
		// register instance
		instance = this;
		// send enable message
		System.out.println("Hello World!");
		// another method to log
		Bukkit.broadcastMessage("Another Hello World!");
		Bukkit.getConsoleSender().sendMessage("Another Hello World! 2x");
		// register events (listener)
		getServer().getPluginManager().registerEvents(new JoinListener(), this); // register join listener
		getServer().getPluginManager().registerEvents(new LeaveListener(), this); // register leave listener
		getServer().getPluginManager().registerEvents(new MobSpawnListener(), this); // register mob spawn listener
		getServer().getPluginManager().registerEvents(new Netty(), this); // register netty listener
		getServer().getPluginManager().registerEvents(new ItemSpawnListener(), this); // register item spawn listener
		// register commands
		// test discord webhook
		DiscordWebhook webhook = new DiscordWebhook(getWebhookURL);
		String str = "Test Message";
		webhook.addEmbed(new DiscordWebhook.EmbedObject()
				.setDescription("[" + getName + "]" + " " + str)); // add description
		try {
			webhook.execute(); // execute webhook
		}
		catch(java.io.IOException e) {
			getLogger().severe(e.getStackTrace().toString()); // catch error
		}
	}
	
	@Override
	public void onDisable() {
		instance = null; // instance null
		System.out.println("Bye World.."); // send disable message
	}
	
}

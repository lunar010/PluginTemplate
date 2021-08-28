package ProjectAIO.yourpluginname.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener{

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		String system = "JoinListener";
		String JoinMessage = " jumped to server";
		e.setJoinMessage("[" + system + "] " + p.getDisplayName() + JoinMessage); // set join message
	}
	
}

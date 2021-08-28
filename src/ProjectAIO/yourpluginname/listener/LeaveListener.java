package ProjectAIO.yourpluginname.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveListener implements Listener {
	
	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		String system = "QuitListener";
		String QuitMessage = "! byebye";
		e.setQuitMessage("[" + system + "] " + p.getDisplayName() + QuitMessage); // send quit message
	}

}

package ProjectAIO.yourpluginname.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;

public class ItemSpawnListener implements Listener {
	
	@EventHandler
	public void onDrop(ItemSpawnEvent e) {
		e.getEntity().setGlowing(true); // set glowing of item to true
	}
	
}

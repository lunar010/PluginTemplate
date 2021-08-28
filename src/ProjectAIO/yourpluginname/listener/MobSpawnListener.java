package ProjectAIO.yourpluginname.listener;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class MobSpawnListener implements Listener {

	@EventHandler
	public void onMobSpawn(CreatureSpawnEvent e) {
		if(e.getEntityType() == EntityType.CREEPER) {
			Creeper creeper = (Creeper) e.getEntity();
			creeper.setPowered(true); // set powered to true of entity
		} else if (e.getEntityType() == EntityType.ZOMBIE || e.getEntityType() == EntityType.SKELETON || e.getEntityType() == EntityType.HUSK) {
			if(e.getEntityType() == EntityType.SKELETON) {
				ItemStack punchBow = new ItemStack(Material.BOW);
				punchBow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 5); // add enchantment to item
				e.getEntity().getEquipment().setItemInMainHand(punchBow); // set entity's item
			} else {
				e.getEntity().getEquipment().setItemInMainHand(new ItemStack(Material.DIAMOND_SWORD)); // set entity's item
			}
			e.getEntity().getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET)); // set entity's armor
			e.getEntity().getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS)); // set entity's armor
			e.getEntity().getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS)); // set entity's armor
			e.getEntity().getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE)); // set entity's armor
		}
	}
	
}

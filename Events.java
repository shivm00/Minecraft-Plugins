package Test_Plugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class Events implements Listener {

	public static void onRightClick(PlayerInteractEvent event){
		if(event.getAction().equals(Action.RIGHT_CLICK_AIR)){
			if(event.getItem()!= null){ //prevents NPE
				if(event.getItem().getItemMeta().equals(Envelope.envelope.getItemMeta())){
					Player user = (Player) event.getPlayer();
					Inventory env = Envelope.createInventory();
					Envelope.openInventory(user, env);
				}
			}
			
		}
		
	}
}

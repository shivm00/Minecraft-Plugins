package Test_Plugin;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class CustomMenu implements Listener{

	public static void openGUI (Player player){
		Inventory inventory= Bukkit.createInventory(null, 1, "Command Center");
		ItemStack envelope = new ItemStack(Material.WHITE_WOOL);
		ItemMeta envelopeMeta = envelope.getItemMeta();
		envelope.setItemMeta(envelopeMeta);
		ArrayList sLore = new ArrayList<>();
		String lore = "Click here to open envelope";
		sLore.add(lore);
		envelopeMeta.setLore(sLore);
		inventory.setItem(1,envelope);
		
		player.openInventory(inventory); //opens the inventory
	}
	
	@EventHandler
	public void openEnvelope(InventoryClickEvent event){
		Inventory envelopeContents = Bukkit.createInventory(null, 20, ChatColor.RED + "Envelope");
		
		if(event.getWhoClicked() instanceof Player){
			Player p = (Player) event.getWhoClicked();
			ItemStack item = event.getCurrentItem();
			
			if(item.hasItemMeta()){ //if it has item meta
				if(event.getRawSlot()==1){
					p.openInventory(envelopeContents);
				}
			}
		}
		
		
	}
}

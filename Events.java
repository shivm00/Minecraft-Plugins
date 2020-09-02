package me.NerdySteamGamer.Mailing;

import java.util.ArrayList;

import org.bukkit.event.EventHandler;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Events implements Listener {
	
	@EventHandler
	public static void onRightClick(PlayerInteractEvent event){
		if(event.getAction().equals(Action.RIGHT_CLICK_AIR)){
			if(event.getItem()!= null){ //prevents Null Pointer Exception
				if(event.getItem().getItemMeta().equals(Envelope.envelope.getItemMeta())){
					Player user = (Player) event.getPlayer();
					Inventory env = Envelope.createInventory();
					Envelope.openInventory(user, env);
				}
			}
			
		}
		
	}
	
	@EventHandler
	public static void playerJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		event.setJoinMessage("Welcome to the test!"); //send message to confirm plugin has been loaded
		//create item
		ItemStack envelope = new ItemStack(Material.WOODEN_SWORD);
		ItemMeta meta = envelope.getItemMeta();
		meta.setDisplayName("Click to open envelope");
		ArrayList lore = new ArrayList<>();
		lore.add("Envelope holds up to 15 items");
		meta.setLore(lore); 
		meta.addEnchant(Enchantment.LUCK, 1, false); //makes the envelope look cooler
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //hides it from lore
		envelope.setItemMeta(meta);		
		
		player.getInventory().addItem(envelope); //give them the item
	}
}

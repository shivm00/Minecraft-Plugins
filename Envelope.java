package Test_Plugin;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Envelope implements Listener{
	
	public static ItemStack envelope;
	
	
	public static void init(){ //initializes the envelope
		createEnvelope();
		
	}
	
	public static void createEnvelope(){
		ItemStack envelope = new ItemStack(Material.WHITE_BANNER);
		ItemMeta meta = envelope.getItemMeta();
		meta.setDisplayName("Click to open envelope");
		ArrayList lore = new ArrayList<>();
		lore.add("Envelope holds up to 15 items");
		meta.setLore(lore); 
		meta.addEnchant(Enchantment.LUCK, 1, false); //makes the envelope look cooler
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //hides it from lore
		envelope.setItemMeta(meta);
		
	}
	
	public static Inventory createInventory(){ //creates the envelope inventory
		Inventory inv = Bukkit.createInventory(null, 15, ChatColor.RED + "Envelope");
		return inv;
		
	}
	
	public static void openInventory(Player player, Inventory inv){ //allows the player to open the envelope inventory
		player.openInventory(inv);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

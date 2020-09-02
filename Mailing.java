package me.NerdySteamGamer.Mailing;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Mailing extends JavaPlugin   {
	
	@Override
	public void onEnable(){ //startup commands
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "Testing has started");
		Bukkit.getServer().getPluginManager().registerEvents(new Events(), this);	
		getCommand("giveEnvelope").setExecutor(new Commands());
		
	}
	
	@Override
	public void onDisable(){ //
		
	}
	
	
	public boolean receiveEnvelope(){
		return false; //placeholder
	}
	
	public boolean putItemsIntoEnvelope(){
		
		return false; //placeholder
	}
	
	public boolean provideNameToSend(){
		return false; //placeholder
	}
	
	public boolean sendEnvelope(){
		return false; //placeholder
	}
	
	public void sendNotificationToReceipient(){
		
	}
	
	public boolean openInventoryofEnvelope(){
		return false; //placeholder
	}
	
	
	
	
	
}

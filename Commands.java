package me.NerdySteamGamer.Mailing;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)){
			sender.sendMessage("Only players can use this command");
			return true;
		}
		
		Player user = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("giveEnvelope")){
			user.getInventory().addItem(Envelope.envelope);
		}
		
		return true;
	}

}

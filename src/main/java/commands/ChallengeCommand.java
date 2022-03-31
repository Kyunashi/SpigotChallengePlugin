package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ChallengeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (args.length == 0) {

			Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Backpack plugin started");
			return true;
		}

		switch (args[0].toLowerCase()) {

		case "start":
			break;

		case "stop":
			break;

		}

		return false;
	}

}

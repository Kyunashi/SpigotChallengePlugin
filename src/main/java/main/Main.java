package main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import commands.ChallengeCommand;

public class Main extends JavaPlugin {

	public static Main instance;

	@Override
	public void onLoad() {

		instance = this;

	}

	@Override
	public void onDisable() {

		super.onDisable();
	}

	@Override
	public void onEnable() {

		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Challengeplugin loaded");
		PluginManager manager = Bukkit.getPluginManager();

		getCommand("challenge").setExecutor(new ChallengeCommand());
	}

}

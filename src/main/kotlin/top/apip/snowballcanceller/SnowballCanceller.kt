package top.apip.snowballcanceller

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import top.apip.snowballcanceller.listener.SnowballListener

class SnowballCanceller : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(SnowballListener(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
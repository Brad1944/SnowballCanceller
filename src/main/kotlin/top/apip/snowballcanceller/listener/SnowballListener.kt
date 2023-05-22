package top.apip.snowballcanceller.listener

import org.bukkit.entity.Snowball
import org.bukkit.entity.Snowman
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.ProjectileLaunchEvent

class SnowballListener: Listener {

    @EventHandler
    fun onThrow(event: ProjectileLaunchEvent) {
        if (event.entity.shooter is Snowman) {
            if (event.entity is Snowball) {
                event.isCancelled = true
            }
        }
    }

}
package xyz.vylenix.vylenetworkLobby;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.vylenix.vylenetworkAPI.events.DoubleJumpEvent;
import xyz.vylenix.vylenetworkLobby.events.DisableHungerEvent;

public final class VylenetworkLobby extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new DoubleJumpEvent(), this);
        getServer().getPluginManager().registerEvents(new DisableHungerEvent(), this);
    }
}

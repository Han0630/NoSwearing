package cn.noswearing;

import cn.noswearing.CommandReload.PluginsReload;
import cn.noswearing.Events.ChatEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoSwearing extends JavaPlugin {

    public static Plugin plugin;
    @Override
    public void onLoad(){
        getLogger().info("§7[§eNoSwearing§7] §e > §7正在启动...");
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

        getLogger().info("§7[§eNoSwearing§7] §e > §7插件成功启用!");
        Bukkit.getPluginCommand("NoSwearing").setExecutor(new PluginsReload());
        Bukkit.getPluginManager().registerEvents(new ChatEvent(),this);
        plugin=this;
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("§7[§eNoSwearing§7] §e > §c插件关闭成功!");
    }
}

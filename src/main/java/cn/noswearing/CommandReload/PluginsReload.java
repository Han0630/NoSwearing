/*
 * 版权所有(c) 蓝钦 2023-9-25 23:7:10
 * 适度编码益脑，沉迷编码伤身，合理安排时间，享受快乐生活。
 * 未经许可-禁止使用
 *
 * Copyright (c) LanQin_ All Rights Reserved.
 * 2023-9-25 23:7:10
 * Unauthorized - Prohibited Use
 */

package cn.noswearing.CommandReload;

import cn.noswearing.NoSwearing;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.File;

public class PluginsReload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("NoSwearing")){
            if (args.length == 0){
                sender.sendMessage("§6===== §7[§eNoSwearing§7] §6====");
                sender.sendMessage("§b/ns reload §7重载插件");
                return true;
            }
            File file = new File(NoSwearing.plugin.getDataFolder(), "config.yml");
            if (args[0].equalsIgnoreCase("reload")){
                if (!file.exists()){
                    NoSwearing.plugin.saveDefaultConfig();
                    sender.sendMessage("§7[§eNoSwearing§7] §e > §7未找到您的Config.yml,正在为您重新生成Config.yml");
                }else {
                    NoSwearing.plugin.reloadConfig();
                    sender.sendMessage("§7[§eNoSwearing§7] §e > §7配置文件已重载");
                }
            }
        }
        return false;
    }
}

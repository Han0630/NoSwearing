/*
 * 版权所有(c) 蓝钦 2023-9-25 23:37:46
 * 适度编码益脑，沉迷编码伤身，合理安排时间，享受快乐生活。
 * 未经许可-禁止使用
 *
 * Copyright (c) LanQin_ All Rights Reserved.
 * 2023-9-25 23:37:46
 * Unauthorized - Prohibited Use
 */

package cn.noswearing.Events;

import cn.noswearing.NoSwearing;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {
    @EventHandler
    public void PlayerChatEvent(AsyncPlayerChatEvent e){
        Player player = e.getPlayer();
        String playerchat = e.getMessage();
        for (int i = 0; i < NoSwearing.plugin.getConfig().getStringList("key").size(); i++){
            if (playerchat.contains(NoSwearing.plugin.getConfig().getStringList("key").get(i))){
                e.setCancelled(true);
                player.sendMessage("§7[§a通知§7] §e> §c您发送的聊天包含违规请修改后重新发送");
            }
        }
    }
}

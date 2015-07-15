/*
 * Copyright 2014
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.grzegorz2047.uniguild.platform.bukkit.listener;

import java.util.UUID;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.grzegorz2047.uniguild.manager.UniPlayerManager;
import pl.grzegorz2047.uniguild.platform.bukkit.BukkitUniID;
import pl.grzegorz2047.uniguild.platform.bukkit.UniGuildBukkit;
import pl.grzegorz2047.uniguild.player.UniID;

public class PlayerJoinListener implements Listener {
    
    @EventHandler
    public void handleEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        UniID uuid = new BukkitUniID(player.getUniqueId());
        System.out.print("Wykonuje playerJoinEvent!");
        
        if(!UniPlayerManager.exists(uuid)) {
            UniPlayerManager.createPlayer(uuid);
        }
    }
}

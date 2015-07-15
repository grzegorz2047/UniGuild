/*
 * Copyright 2015 Grzegorz.
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
package pl.grzegorz2047.uniguild.platform.bukkit;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import pl.grzegorz2047.uniguild.UniGuild;
import pl.grzegorz2047.uniguild.UniGuild.ServerType;
import pl.grzegorz2047.uniguild.platform.bukkit.listener.PlayerJoinListener;
import pl.grzegorz2047.uniguild.platform.bukkit.listener.PlayerQuitListener;

/**
 *
 * @author Grzegorz
 */
public class UniGuildBukkit extends JavaPlugin{

    private static UniGuild plugin;
    private static UniGuildBukkit bukkitPlugin;//Singleton 
    

    @Override
    public void onEnable() {
        if(!this.isCompatible()){
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        plugin = new UniGuild(ServerType.BUKKIT);
        plugin.start();
        bukkitPlugin = this;     
        loadAllListeners();
    }
    
    @Override
    public void onDisable() {
        plugin.stop();
    }
    private void loadAllListeners() {
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new PlayerQuitListener(), this);

    }
    public boolean isCompatible(){
        try {
            if(getServer().getOfflinePlayer("Notch").getUniqueId() == null) {
                Bukkit.getLogger().warning("Your Minecraft server version is lower than 1.7.5!");
                Bukkit.getLogger().warning("This plugin is not compatibile with your version of Minecraft server!");
                return false;
            }
        } catch(Exception e) {
            Bukkit.getLogger().warning("Your Minecraft server version is lower than 1.7.5!");
            Bukkit.getLogger().warning("This plugin is not compatibile with your version of Minecraft server!");
            return false;
        }
        
        System.out.print("Your Minecraft server version is " + Bukkit.getVersion());
        return true;
    }

    public static UniGuildBukkit getBukkitPlugin() {
        return bukkitPlugin;
    }
    
    public static UniGuild getPlugin() {
        return plugin;
    }
    
}

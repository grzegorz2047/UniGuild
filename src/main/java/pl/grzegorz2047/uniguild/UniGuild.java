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
package pl.grzegorz2047.uniguild;

/**
 *
 * @author Grzegorz
 */
public class UniGuild {
    
    private String name = "UniGuild";
    private float version = 0.1f;
    
    // Spigot == Bukkit ?
    public enum ServerType { BUKKIT, SPIGOT, SPONGE};
    
    private ServerType type;
    
    public UniGuild(ServerType type){
        this.type = type;
    }
    
    public void start(){
        System.out.println("Plugin "+this.name+" "+this.version+" zostal uruchomiony");
    }
    
    public void stop(){
        //TODO
    }
    
}

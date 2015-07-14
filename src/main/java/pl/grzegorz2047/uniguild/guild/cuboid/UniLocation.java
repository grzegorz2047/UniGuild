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
package pl.grzegorz2047.uniguild.guild.cuboid;

/**
 *
 * @author Grzegorz
 */
public class UniLocation {
    
    
    private UniWorld world;
    private final double x,y,z;
    private float pitch;
    private float yaw;
    
    public UniLocation(UniWorld world, double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public UniWorld getWorld() {
        return world;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    
    public boolean isInAABB(UniLocation min, UniLocation max){
        
        return x >= min.x && x <= max.x && y >= min.y && y <= max.y && z >= min.z && z <= max.z;
    }

    public float getPitch() {
        return pitch;
    }

    public float getYaw() {
        return yaw;
    }
    
    
    
}

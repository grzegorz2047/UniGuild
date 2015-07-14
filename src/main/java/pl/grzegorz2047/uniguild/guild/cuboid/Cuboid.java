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
public class Cuboid {
    private UniLocation center;
    private int radius;
    private String owner;

    public UniLocation getCenter() {
        return this.center;
    }

    public int getRadius() {
        return this.radius;
    }

    public boolean isinCuboid(UniLocation loc) {
        return loc.isInAABB(this.getMin(), this.getMax());
    }

    public void setCenter(UniLocation center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String tag) {
        this.owner = tag;
    }

    public UniLocation getMin() {
        return new UniLocation(this.center.getWorld(), this.center.getX() - this.radius, 0, this.center.getZ() - this.radius);
    }

    public UniLocation getMax() {
        return new UniLocation(this.center.getWorld(), this.center.getX() + this.radius, this.center.getWorld().getMaxHeight(), this.center.getZ() + this.radius);
    }
}

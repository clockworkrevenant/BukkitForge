package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.monster.EntityGolem;

import org.bukkit.craftbukkit.BukkitServer;
import org.bukkit.entity.Golem;
//import org.bukkit.craftbukkit.BukkitServer;

public class BukkitGolem extends BukkitCreature implements Golem {
    public BukkitGolem(BukkitServer server, EntityGolem entity) {
        super(server, entity);
    }

    @Override
    public EntityGolem getHandle() {
        return (EntityGolem) entity;
    }

    @Override
    public String toString() {
        return "BukkitGolem";
    }
}
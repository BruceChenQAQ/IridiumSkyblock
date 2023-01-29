package com.iridium.iridiumskyblock.api;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called after the shop has been reloaded successfully.
 */
public class IridiumSkyblockReloadEvent extends Event {
    
    private static final HandlerList handlers = new HandlerList();
    
    @NotNull
    public HandlerList getHandlers() {
        return handlers;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
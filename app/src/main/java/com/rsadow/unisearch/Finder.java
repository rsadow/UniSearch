package com.rsadow.unisearch;

/**
 * Created by Robert on 11.07.2016.
 */
abstract class Finder implements IFinder {

    private Boolean enabled = true;

    @Override
    public Boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }
}

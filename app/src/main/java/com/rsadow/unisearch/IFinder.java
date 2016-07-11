package com.rsadow.unisearch;

import java.util.ArrayList;

/**
 * Created by Robert on 11.07.2016.
 */

public interface IFinder {
    ArrayList<FindResult> find(String expr);
    Boolean isEnabled();
    void enable();
    void disable();
}

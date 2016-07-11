package com.rsadow.unisearch;

import android.content.Context;

/**
 * Created by Robert on 11.07.2016.
 */
public class FinderFactory {

    public static IFinder createProgramFinder(Context ctx) {
        return new ProgramFinder(ctx);
    }

    public static IFinder createContactFinder() {
        return new ContactFinder();
    }
}

package com.rsadow.unisearch;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robert on 11.07.2016.
 */
public class ProgramFinder extends Finder {

    List<ApplicationInfo> apps_ = null;

    public ProgramFinder(Context ctx) {
        this.apps_ = ctx.getPackageManager().getInstalledApplications(PackageManager.GET_META_DATA);
    }

    @Override
    public ArrayList<FindResult> find(String expr) {

        ArrayList<FindResult> result = new ArrayList<>();
        for(ApplicationInfo ai: this.apps_){
            result.add(new FindResult(ai.packageName));
        }

        return result;

    }
}

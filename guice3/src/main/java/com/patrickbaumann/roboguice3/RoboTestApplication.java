package com.patrickbaumann.roboguice3;

import android.app.Application;
import roboguice.RoboGuice;

/**
 * Created with IntelliJ IDEA.
 * User: patrick
 * Date: 10/17/12
 * Time: 10:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class RoboTestApplication extends Application {

    public static long startTime = System.currentTimeMillis();
    static {
        RoboGuice.setUseAnnotationDatabases(false);
    }
    @Override
    public void onCreate() {
        super.onCreate();
//        RoboGuice.getOrCreateBaseApplicationInjector(this, RoboGuice.DEFAULT_STAGE,
//                RoboGuice.newDefaultRoboModule(this), new RoboTestModule(), new BaseRoboModule());
    }
}

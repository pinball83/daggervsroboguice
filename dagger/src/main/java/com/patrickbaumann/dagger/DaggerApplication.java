package com.patrickbaumann.dagger;

import android.app.Application;
import dagger.ObjectGraph;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: patrick
 * Date: 10/17/12
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class DaggerApplication extends Application{

    public static long startTime = System.currentTimeMillis();

    private ObjectGraph graph;

    @Override public void onCreate() {
        super.onCreate();

        graph = ObjectGraph.create(getModules().toArray());
    }

    protected List<Object> getModules() {
        return Arrays.asList(
                new ApplicationModule(this),
                new DaggerTestModule(),
                new BaseDaggerModule()
        );
    }

    public void inject(Object object) {
        graph.inject(object);
    }

}

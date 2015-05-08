package com.patrickbaumann.dagger;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created with IntelliJ IDEA.
 * User: patrick
 * Date: 10/9/12
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
@Module(
        injects = HelloAndroidActivity.class,
        complete = false,
        library=true
//        includes = {BaseDaggerModule.class, DaggerTestModule.class}
)
public class ApplicationModule {
    private DaggerApplication application;

    public ApplicationModule(DaggerApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return application;
    }
}

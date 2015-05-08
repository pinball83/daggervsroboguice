package com.patrickbaumann.dagger;

import com.thrd.base.Interface30;
import dagger.Module;
import dagger.Provides;

/**
 * Created with IntelliJ IDEA.
 * User: patrick
 * Date: 10/9/12
 * Time: 11:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Module(library=true)
public class DaggerTestModule {
    @Provides
    Interface30 getInterface30(){
        return new Implementation30();
    }

}

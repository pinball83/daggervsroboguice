package com.patrickbaumann.dagger;

import android.app.Activity;
import android.os.Bundle;
import com.thrd.base.Interface0;

import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: patrick
 * Date: 10/9/12
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class DaggerActivity extends Activity {
    @Inject
    Interface0 dep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((DaggerApplication) getApplication()).inject(this);
    }
}

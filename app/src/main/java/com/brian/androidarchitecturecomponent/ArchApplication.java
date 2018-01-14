package com.brian.androidarchitecturecomponent;

import com.brian.androidarchitecturecomponent.di.component.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * @author Brian
 * @date: 1/13/18
 */


public class ArchApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}

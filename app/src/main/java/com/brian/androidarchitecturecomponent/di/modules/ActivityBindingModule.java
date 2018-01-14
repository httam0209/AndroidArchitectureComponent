package com.brian.androidarchitecturecomponent.di.modules;

import com.brian.androidarchitecturecomponent.view.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Brian
 * @date: 1/14/18
 */

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = FragmentBuilderModule.class)
    abstract MainActivity mainActivity();
}

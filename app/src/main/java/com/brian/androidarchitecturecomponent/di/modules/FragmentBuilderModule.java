package com.brian.androidarchitecturecomponent.di.modules;

import com.brian.androidarchitecturecomponent.view.ui.ProjectDetailFragment;
import com.brian.androidarchitecturecomponent.view.ui.ProjectsFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Brian
 * @date: 1/14/18
 */

@Module
public abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract ProjectsFragment projectsFragment();

    @ContributesAndroidInjector
    abstract ProjectDetailFragment projectDetailFragment();

}

package com.brian.androidarchitecturecomponent.di.modules;

import android.content.Context;

import com.brian.androidarchitecturecomponent.ArchApplication;

import dagger.Module;
import dagger.Provides;

/**
 * @author Brian
 * @date: 1/13/18
 */


@Module
public class AppModule {

    @Provides
    Context context(ArchApplication archApplication) {
        return archApplication.getApplicationContext();
    }
}

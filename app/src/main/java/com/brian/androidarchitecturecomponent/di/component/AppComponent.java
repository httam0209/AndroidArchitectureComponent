package com.brian.androidarchitecturecomponent.di.component;

import com.brian.androidarchitecturecomponent.ArchApplication;
import com.brian.androidarchitecturecomponent.di.modules.ActivityBindingModule;
import com.brian.androidarchitecturecomponent.di.modules.AppModule;
import com.brian.androidarchitecturecomponent.di.modules.NetModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author Brian
 * @date: 1/13/18
 */

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        NetModule.class,
        ActivityBindingModule.class
})
public interface AppComponent extends AndroidInjector<ArchApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder application(ArchApplication archApplication);

        AppComponent build();
    }
    void inject(ArchApplication archApplication);
}

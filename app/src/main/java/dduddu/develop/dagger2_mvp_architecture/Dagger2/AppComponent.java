package dduddu.develop.dagger2_mvp_architecture.Dagger2;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dduddu.develop.dagger2_mvp_architecture.Data.DataManager;
import dduddu.develop.dagger2_mvp_architecture.Data.ServerModule;
import dduddu.develop.dagger2_mvp_architecture.MyApplication;

@Singleton
@Component(modules = { AndroidSupportInjectionModule.class,
        ApplicationModule.class,
        ActivityBindingModule.class,
        ServerModule.class })
public interface AppComponent extends AndroidInjector<MyApplication> {

    DataManager getDataManager();

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}

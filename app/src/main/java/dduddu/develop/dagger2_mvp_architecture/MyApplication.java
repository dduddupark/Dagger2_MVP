package dduddu.develop.dagger2_mvp_architecture;

import android.content.Context;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dduddu.develop.dagger2_mvp_architecture.Dagger2.DaggerAppComponent;

public class MyApplication extends DaggerApplication { //DaggerApplication을 상속 받아야한다.

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }

}

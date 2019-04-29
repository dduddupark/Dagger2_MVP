package dduddu.develop.dagger2_mvp_architecture.Data;

import android.provider.ContactsContract;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Provides;
import dduddu.develop.dagger2_mvp_architecture.Dagger2.Local;

@Module
abstract public class ServerModule {

    @Singleton
    @Provides
    static DataManager provideDataManager()
    { return new DataManager(new MainData());}

}

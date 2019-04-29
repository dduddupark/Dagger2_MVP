package dduddu.develop.dagger2_mvp_architecture.Dagger2;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dduddu.develop.dagger2_mvp_architecture.UI.Main.MainActivity;
import dduddu.develop.dagger2_mvp_architecture.UI.Main.MainModule;


@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();

}

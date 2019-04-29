package dduddu.develop.dagger2_mvp_architecture.UI.Main;

import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

import dduddu.develop.dagger2_mvp_architecture.Data.DataManager;

public class MainPresenter implements MainInterface.Presenter {

    DataManager dataManager;

    //여기서 @Inject를 해주면 MainModule에서 @Provide를 안해도 생성자때 알아서 공급된다.
    @Inject
    MainPresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Nullable
    MainInterface.View view;

    @Override
    public void takeView(MainInterface.View view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        view = null;
    }

    @Override
    public void loadText() {

        Log.d("dduddu", dataManager == null ? "dataManager null" : "dataManager not null");

        String str =  dataManager.getMainData();
        if (view != null) {
            view.setText(str);
        }
    }
}

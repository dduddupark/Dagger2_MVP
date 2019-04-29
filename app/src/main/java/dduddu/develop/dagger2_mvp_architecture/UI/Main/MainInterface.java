package dduddu.develop.dagger2_mvp_architecture.UI.Main;

import dduddu.develop.dagger2_mvp_architecture.UI.Base.BasePresenter;
import dduddu.develop.dagger2_mvp_architecture.UI.Base.BaseView;

public interface MainInterface {

    interface View extends BaseView<Presenter> {
        void setText(String str);
    }

    interface Presenter extends BasePresenter<View> {
        void loadText();
    }

}

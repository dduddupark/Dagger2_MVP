package dduddu.develop.dagger2_mvp_architecture.UI.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import dduddu.develop.dagger2_mvp_architecture.R;

public class MainActivity extends DaggerAppCompatActivity implements MainInterface.View{ //DaggerAppCompatActivity 상속

    //Presenter를 주입해준다.
    @Inject
    MainPresenter mainPresenter;

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter.takeView(this);

        initView();
        loadData();
    }

    private void initView()
    {
        tv = findViewById(R.id.tv);
    }

    private void loadData()
    {
        mainPresenter.loadText();
    }

    @Override
    public void setText(String str) {
        tv.setText(str);
    }
}

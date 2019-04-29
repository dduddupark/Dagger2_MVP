package dduddu.develop.dagger2_mvp_architecture.Data;

import javax.inject.Inject;
import javax.inject.Singleton;

public class DataManager {

    private final MainData mainData;

    DataManager(MainData mainData) {
        this.mainData = mainData;
    }

    public String getMainData()
    {
        return mainData.loadServer();
    }

}

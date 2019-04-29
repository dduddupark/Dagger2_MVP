package dduddu.develop.dagger2_mvp_architecture.Data;

import javax.inject.Inject;

public class MainData {

    @Inject
    public MainData() {}

    private String str;

    public String getStr() { return str; }

    public void setStr(String str) { this.str = str; }

    public String loadServer()
    {
        //서버 로직...

        return "Hello Dagger2";
    }
}

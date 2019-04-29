# Dagger2_MVP

[Dagger2]

<기본 개념>

① Binds - 두 개 이상의 프로그래밍 개체를 서로 묶는 것

② Inject - 주입하다

③ Module - 단위, 의존성 객체 선언

④ Component - Module을 이용해 의존성객체를 생성하고 Inject선언시 의존성 객체를 주입시켜줌

⑤ Scoped - LifeCycle의 범위

⑥ Provides - 제공하다

⑦ ContributesAndroidInjector - ...?ㅠㅠㅠ

[Application Component]
→ Applicaton Module(@Provide, @Singleton)  //즉슨 앱이 죽을때까지 살아있음.

  [Activity Component]
  → Activity Module(@Provide, @PerActivity)  //액티비티 전체를 관리한다. ActivityBindingModule.class
  
   [User Component] @inject
    → User Module (@Provide, @PerActivity)  //Activity Component의 SubComponent. MainModule.class



    
[MVP(Model View Presenter)]

Model - 서버통신을 담당. DataManager.class

Presenter - Model(데이터)와 View(화면) 사이에서 일하는 애. MainPresenter.class

View - 화면 동작들(click, notify 등등) 담당. MainActivity.class

<구조>
Model→ Presenter → Interface(View, Presenter) - MainInterfac.class ← Activity

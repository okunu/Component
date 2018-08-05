package com.okunu.base;

import android.app.Application;

public abstract class BaseApp extends Application {

    /*
    * application初始化
     */
    public abstract void initModuleApp(Application application);

    /*
    * application初始化后的自定义操作
     */
    public abstract void initModeleData(Application application);
}

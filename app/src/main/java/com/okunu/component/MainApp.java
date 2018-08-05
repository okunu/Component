package com.okunu.component;

import android.app.Application;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;
import com.okunu.base.AppConfig;
import com.okunu.base.BaseApp;

public class MainApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebug()){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
        initModuleApp(this);
        initModeleData(this);
    }

    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }
    @Override
    public void initModuleApp(Application application) {
        for (String app : AppConfig.modulesApp){
            try{
                Class clazz = Class.forName(app);
                BaseApp baseApp = (BaseApp) clazz.newInstance();
                baseApp.initModuleApp(this);
            }catch (Exception e){
                Log.d("okunu","", e);
            }
        }
    }

    @Override
    public void initModeleData(Application application) {
        for (String app : AppConfig.modulesApp){
            try{
                Class clazz = Class.forName(app);
                BaseApp baseApp = (BaseApp) clazz.newInstance();
                baseApp.initModeleData(this);
            }catch (Exception e){
            }
        }
    }
}

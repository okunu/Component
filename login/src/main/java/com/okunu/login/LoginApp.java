package com.okunu.login;

import android.app.Application;
import android.util.Log;

import com.okunu.base.BaseApp;
import com.okunu.componentbase.ServiceFactory;

public class LoginApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModeleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setAccountService(new AccountService());
        Log.d("okunu","loginapp initModuleApp");
    }

    @Override
    public void initModeleData(Application application) {

    }
}

package com.okunu.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/account/login")
public class LoginActivity extends AppCompatActivity{

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView(){
        textView = findViewById(R.id.tv_login_state);
    }

    public void login(View view){
        AccountUtils.userInfo = new UserInfo("10086","admin");
        updateLoginState();
    }

    private void updateLoginState() {
        textView.setText("这里是登录界面：" + (AccountUtils.userInfo == null ? "未登录" : AccountUtils.userInfo.getUserName()));
    }

    public void exit(View view){
        AccountUtils.userInfo = null;
        updateLoginState();
    }
    public void share(View view){
        ARouter.getInstance().build("/share/share").navigation();
    }
}

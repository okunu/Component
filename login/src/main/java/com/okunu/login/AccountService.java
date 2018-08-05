package com.okunu.login;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.okunu.componentbase.service.IAccountService;

public class AccountService implements IAccountService {
    @Override
    public boolean isLogin() {
        return AccountUtils.userInfo != null ? true : false;
    }

    @Override
    public String getAccountId() {
        return AccountUtils.userInfo != null ? AccountUtils.userInfo.getAccountId() : null;
    }

    @Override
    public Fragment newUserFragment(Activity activity, int containerId, FragmentManager manager, Bundle bundle, String tag) {
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = new UserFragment();
        transaction.add(containerId, fragment, tag);
        transaction.commit();
        return  fragment;
    }
}

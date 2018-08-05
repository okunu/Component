package com.okunu.componentbase.service;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public interface IAccountService {

    boolean isLogin();

    String getAccountId();

    Fragment newUserFragment(Activity activity, int containerId,
                             FragmentManager manager, Bundle bundle, String tag);
}

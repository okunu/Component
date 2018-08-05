package com.okunu.login;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class UserFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        TextView tvName = view.findViewById(R.id.tv_user_name);
        tvName.setText(AccountUtils.userInfo != null ? AccountUtils.userInfo.getUserName() : "未登录");
        return  view;
    }
}

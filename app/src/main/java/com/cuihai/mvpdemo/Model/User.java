package com.cuihai.mvpdemo.Model;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.MainThread;
import android.util.Log;
import android.widget.Toast;

import com.cuihai.mvpdemo.LoginActivity;
import com.cuihai.mvpdemo.MainActivity;
import com.cuihai.mvpdemo.View.IUserView;

/**
 * author:  崔海
 * time:    2016/10/22 23:06
 * name:
 * overview:
 * usage:
 */
public class User implements IUser {
    @Override
    public void login(final String username, final String password, final OnLoginListener onLoginListener) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                if ("cuihai".equals(username) && "123".equals(password)) {
                    UserBean userBean = new UserBean();
                    userBean.setUsername(username);
                    userBean.setPassword(password);
                    onLoginListener.loadSuccess(userBean);
                } else {
                    onLoginListener.showFailed();
                }
            }
        });
    }

    Handler handler = new Handler();
}

package com.cuihai.mvpdemo.Model;

import android.view.View;

/**
 * author:  崔海
 * time:    2016/10/22 23:04
 * name:
 * overview:
 * usage:
 */
public interface IUser {
    void login(String username, String password, OnLoginListener onLoginListener);
}

package com.cuihai.mvpdemo.View;

import com.cuihai.mvpdemo.Model.User;
import com.cuihai.mvpdemo.Model.UserBean;

/**
 * author:  崔海
 * time:    2016/10/22 23:14
 * name:
 * overview:
 * usage:
 */
public interface IUserView {
    String getUsername();
    String getPassword();
    void startLoginActivity(UserBean userBean);
    void showFailed();

}

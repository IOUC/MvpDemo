package com.cuihai.mvpdemo.Presenter;

import android.os.Handler;

import com.cuihai.mvpdemo.Model.IUser;
import com.cuihai.mvpdemo.Model.OnLoginListener;
import com.cuihai.mvpdemo.Model.User;
import com.cuihai.mvpdemo.Model.UserBean;
import com.cuihai.mvpdemo.View.IUserView;

/**
 * author:  崔海
 * time:    2016/10/22 23:23
 * name:
 * overview:
 * usage:
 */
public class UserPresenter {
    IUserView iUserView;
    IUser iUser;

    public UserPresenter(IUserView iUserView){
        this.iUserView=iUserView;
        this.iUser=new User();
    }
    Handler handler=new Handler();

    public void login(){
        iUser.login(iUserView.getUsername(), iUserView.getPassword(), new OnLoginListener() {
            @Override
            public void loadSuccess(final UserBean userBean) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        iUserView.startLoginActivity(userBean);
                    }
                });
            }
            @Override
            public void showFailed() {
                iUserView.showFailed();
            }
        });
    }
}

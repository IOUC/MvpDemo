package com.cuihai.mvpdemo.Model;

import java.io.Serializable;

/**
 * author:  崔海
 * time:    2016/10/22 22:56
 * name:
 * overview:
 * usage:
 */
public class UserBean {
    private String username;
    private String password;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password= password;
    }
}

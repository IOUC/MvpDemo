package com.cuihai.mvpdemo;

import android.content.Intent;
import android.os.IInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.cuihai.mvpdemo.Model.User;
import com.cuihai.mvpdemo.Model.UserBean;
import com.cuihai.mvpdemo.Presenter.UserPresenter;
import com.cuihai.mvpdemo.View.IUserView;

public class MainActivity extends AppCompatActivity implements IUserView  {
    EditText mUsername;
    EditText mPassword;
    Button mLogin;
    UserPresenter userPresenter=new UserPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUsername = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);
        mLogin= (Button) findViewById(R.id.login);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userPresenter.login();
            }
        });

    }

    @Override
    public String getUsername() {
        return mUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return mPassword.getText().toString();
    }

    @Override
    public void startLoginActivity(UserBean userBean) {
        Intent intent=new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }
    @Override
    public void showFailed() {
        Toast.makeText(MainActivity.this, "账号或密码错误", Toast.LENGTH_SHORT).show();
    }

}

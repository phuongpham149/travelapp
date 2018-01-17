package com.example.phamthi.travel_app.activities;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.phamthi.travel_app.R;
import com.example.phamthi.travel_app.base.BaseActivity;

public class SplashActivity extends BaseActivity implements View.OnClickListener {
    public Button btnLogin;
    public Button btnSignUp;

    public TextView txtTitle;
    public TextView txtDes;

    public RelativeLayout rlLogin;
    public RelativeLayout rlRegister;

    @Override
    protected int getResId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initView() {
        btnSignUp = findViewById(R.id.btn_sign_up);
        btnLogin = findViewById(R.id.btn_log_in);
        rlLogin = findViewById(R.id.layout_log_in);
        rlRegister = findViewById(R.id.layout_register);
        txtDes = findViewById(R.id.txt_desc);
        txtTitle = findViewById(R.id.txt_title);
    }

    @Override
    protected void handleEvent() {
        btnLogin.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_log_in: {
                rlLogin.setVisibility(View.VISIBLE);
                showButton(false);
                break;
            }
            case R.id.btn_sign_up: {
                rlRegister.setVisibility(View.VISIBLE);
                showButton(false);
                showText(false);
                break;
            }
            case R.id.layout_log_in: {
                rlLogin.setVisibility(View.GONE);
                showButton(true);
                break;
            }
            case R.id.layout_register: {
                rlRegister.setVisibility(View.GONE);
                showButton(true);
                showText(true);
                break;
            }
        }

    }

    /**
     * Hide button when touch button
     */
    public void showButton(boolean isShow) {
        showView(isShow, btnLogin);
        showView(isShow, btnSignUp);
    }

    /**
     * Hidden text when touch button register
     */
    public void showText(boolean isShow) {
        showView(isShow, txtDes);
        showView(isShow, txtTitle);
    }
}

package com.example.phamthi.travel_app.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResId());
        initView();
        handleEvent();
    }

    /**
     * Get resource id of layout, to view UI for screen.
     *
     * @return the id of layout will be view.
     */
    protected abstract int getResId();

    /**
     * Init component in view by match with it's id in layout
     */
    protected abstract void initView();

    /**
     * Handle event need access in layout
     */
    protected abstract void handleEvent();

    /**
     * Show view along variable isShow.
     *
     * @param isShow is boolean variable to decide view show or hide
     * @param view   the view will be show or hide.
     */
    public void showView(boolean isShow, View view) {
        view.setVisibility(isShow ? View.VISIBLE : View.INVISIBLE);
    }

    /**
     * Call intent to change activity from resActivity to tagActivity.
     *
     * @param resActivity the resource activity will be change by target activity
     * @param tarActivity the target activity will be display instead of resource activity.
     */
    public void callIntent(Activity resActivity, Activity tarActivity) {
        Intent intent = new Intent(resActivity, tarActivity.getClass());
        startActivity(intent);
    }
}

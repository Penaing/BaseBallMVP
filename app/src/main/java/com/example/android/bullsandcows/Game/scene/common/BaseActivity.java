package com.example.android.bullsandcows.Game.scene.common;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Pena on 2017-04-29.
 */
public class BaseActivity extends AppCompatActivity implements BaseConstractor.BaseView {


    @Override
    public void showProgress() {

    }

    @Override
    public void dismissProgress() {

    }

    @Override
    public void alert(String msg) {

    }

    @Override
    public void alert(String msg, View.OnClickListener listener) {

    }
}

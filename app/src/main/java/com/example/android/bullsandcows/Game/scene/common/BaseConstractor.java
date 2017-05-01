package com.example.android.bullsandcows.Game.scene.common;

import android.view.View;

/**
 * Created by Pena on 2017-04-29.
 */
public class BaseConstractor {

    public interface BaseView
    {
        void showProgress();
        void dismissProgress();

        void alert(String msg);
        void alert(String msg, View.OnClickListener listener);
    }

    public interface BasePresenter
    {

    }
}

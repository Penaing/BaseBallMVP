package com.example.android.bullsandcows.scenes.common;

/**
 * Created by Pena on 2017-05-01.
 */
public interface BaseContractor {

    interface BaseView <T> {
        void setPresenter(T presenter);
    }

    interface BasePresenter {
        void start();
    }

}

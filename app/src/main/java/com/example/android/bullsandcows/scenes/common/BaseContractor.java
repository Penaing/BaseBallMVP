package com.example.android.bullsandcows.scenes.common;

/**
 * Created by Pena on 2017-05-01.
 */
public interface BaseContractor {

    interface BaseView {

    }

    interface BasePresenter <T> {

        void attachView(T view);
        void detachView();

    }

}

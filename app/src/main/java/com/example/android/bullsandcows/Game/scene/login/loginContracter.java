package com.example.android.bullsandcows.Game.scene.login;

import com.example.android.bullsandcows.Game.scene.common.BaseConstractor;

/**
 * Created by Pena on 2017-04-29.
 */
public interface LoginContracter {

    interface View extends BaseConstractor.BaseView
    {

        String getId();
        void onLoginSucess();
        void onLoginFaile();
    }

    interface Presenter extends BaseConstractor.BasePresenter
    {
        public void onClickLogin(View v);
    }
}

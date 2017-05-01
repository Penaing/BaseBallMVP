package com.example.android.bullsandcows.Game.scene.login;

import android.content.Context;

/**
 * Created by Pena on 2017-04-29.
 */
public class LoginPresenter implements LoginContracter.Presenter {

    Context mContext;
    LoginContracter.View mView;

    LoginPresenter(Context ct, LoginContracter.View view) {
        mContext = ct;
        mView = view;
    }

    /**
     *  구현해주세요
     * @param v
     */
    @Override
    public void onClickLogin(LoginContracter.View v) {
        // Todo 여기에 로그인 코드 구현 - 기본적인 아이디 패스워드 규칙 확인 하고 서버 통신해서 콜백 호출해야함.
        if (mView.getId() == null || mView.getId().length() < 0)
            mView.alert("로그인 실패");
        if(true)
        {
            mView.onLoginSucess();
        }
        else
        {
            mView.onLoginFaile();
        }
    }
}

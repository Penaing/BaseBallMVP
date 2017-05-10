package com.example.android.bullsandcows.scenes.game;

import android.content.Context;

/**
 * Created by Pena on 2017-05-10.
 */
public class GamePresenter implements GameContractor.Presenter {

    private GameContractor.View mGameView;

    private Context mContext;

    public GamePresenter(Context context, GameContractor.View gameView) {
        mContext  = context;
        mGameView = gameView;

        mGameView.setPresenter(this);
    }

    @Override
    public void start() {

    }

}

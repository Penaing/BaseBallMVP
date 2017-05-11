package com.example.android.bullsandcows.scenes.game;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.android.bullsandcows.data.GameDataSource;

/**
 * Created by Pena on 2017-05-10.
 */
public class GamePresenter implements GameContractor.Presenter {

    private GameContractor.View mGameView;
    private GameDataSource mGameData;

    public GamePresenter(@NonNull GameContractor.View gameView) {
        mGameView = gameView;
        mGameView.setPresenter(this);
    }

    @Override
    public void start() {
        mGameData.startGame();

        mGameView.displayPlayerData(mGameData.getPlayerDataAsString());
        mGameView.displayChaance(mGameData.getCompareChance());
        mGameView.displayGameScore(mGameData.calcGameScore());
    }

    @Override
    public void setGameData(GameDataSource gameData) {
        mGameData = gameData;
    }

    @Override
    public void inputPlayerData(int playerData) {
        if (mGameData == null)
            return;

        mGameData.inputPlayerData(playerData);
        mGameView.displayPlayerData(mGameData.getPlayerDataAsString());
    }

    @Override
    public void backPlayerData() {
        if (mGameData == null)
            return;

        mGameData.backPlayerData();
        mGameView.displayPlayerData(mGameData.getPlayerDataAsString());
    }

    @Override
    public void calcGameData() {
        if (mGameData == null)
            return;

        String result = mGameData.calcGameScore();

        mGameView.displayChaance(mGameData.getCompareChance());
        mGameView.displayGameScore(result);

        if (result.equals("S3B0"))
            mGameView.showWinToast();
        else if (mGameData.getCompareChance().equals("0"))
            mGameView.showLoseToast();
    }
}

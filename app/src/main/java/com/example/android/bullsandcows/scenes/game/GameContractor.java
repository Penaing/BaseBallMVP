package com.example.android.bullsandcows.scenes.game;

import com.example.android.bullsandcows.data.GameDataSource;
import com.example.android.bullsandcows.scenes.common.BaseContractor;

/**
 * Created by Pena on 2017-05-10.
 */
public interface GameContractor {

    interface View extends BaseContractor.BaseView<Presenter> {
        void displayGameScore(String score);
        void displayPlayerData(String playerData);
        void displayChaance(String compareChance);
        void showWinToast();
        void showLoseToast();

        void onClickNumber1(android.view.View view);
        void onClickNumber2(android.view.View view);
        void onClickNumber3(android.view.View view);
        void onClickNumber4(android.view.View view);
        void onClickNumber5(android.view.View view);
        void onClickNumber6(android.view.View view);
        void onClickNumber7(android.view.View view);
        void onClickNumber8(android.view.View view);
        void onClickNumber9(android.view.View view);

        void onClickBack(android.view.View view);
        void onClickEnter(android.view.View view);
    }

    interface Presenter extends BaseContractor.BasePresenter {
        void setGameData(GameDataSource gameData);
        void inputPlayerData(int playerData);
        void backPlayerData();
        void calcGameData();
    }

}

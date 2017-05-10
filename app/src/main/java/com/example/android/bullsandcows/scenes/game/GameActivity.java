package com.example.android.bullsandcows.scenes.game;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Pena on 2017-05-10.
 */
public class GameActivity extends AppCompatActivity {

    private GamePresenter mGamePresenter;

    @Override
    public void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GameFragment gameFragment = GameFragment.newInstance();

        mGamePresenter = new GamePresenter(this, gameFragment);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

}

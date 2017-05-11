package com.example.android.bullsandcows.scenes.game;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.android.bullsandcows.R;
import com.example.android.bullsandcows.data.GameDataSource;
import com.example.android.bullsandcows.databinding.ActivityMainBinding;

/**
 * Created by Pena on 2017-05-10.
 */
public class GameActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    public void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        GameFragment gameFragment = GameFragment.newInstance();
        FragmentManager     fm = getFragmentManager();
        FragmentTransaction tr = fm.beginTransaction();
        tr.add(R.id.game_framelayout, gameFragment);
        tr.commit();

        GamePresenter gamePresenter = new GamePresenter(gameFragment);
        gamePresenter.setGameData(GameDataSource.getInstance());
    }

}

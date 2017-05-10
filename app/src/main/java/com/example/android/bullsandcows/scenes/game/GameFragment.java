package com.example.android.bullsandcows.scenes.game;

import android.app.Fragment;
import android.support.annotation.NonNull;

/**
 * Created by Pena on 2017-05-10.
 */
public class GameFragment extends Fragment implements GameContractor.View {

    public static GameFragment newInstance() {
        return new GameFragment();
    }

    @Override
    public void setPresenter(@NonNull GameContractor.Presenter presenter) {

    }

}

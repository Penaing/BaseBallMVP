package com.example.android.bullsandcows.scenes.game;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.android.bullsandcows.R;
import com.example.android.bullsandcows.databinding.FragmentGameBinding;

/**
 * Created by Pena on 2017-05-10.
 */
public class GameFragment extends Fragment implements GameContractor.View {

    private GameContractor.Presenter mGamePresenter;
    private FragmentGameBinding      mBinding;

    public static GameFragment newInstance() {
        return new GameFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();

        mGamePresenter.start();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_game, parent, false);
        mBinding.setFragment(this);

        return mBinding.getRoot();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void setPresenter(@NonNull GameContractor.Presenter presenter) {
        mGamePresenter = presenter;
    }

    @Override
    public void displayGameScore(String score) {
        mBinding.gameScoreText.setText(score);
    }

    @Override
    public void displayPlayerData(String playerData) {
        mBinding.playerDataText.setText(playerData);
    }

    @Override
    public void displayChaance(String compareChance) {
        mBinding.chanceText.setText(compareChance);
    }

    @Override
    public void showWinToast() {
        Toast.makeText(getActivity(), "Win :)", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoseToast() {
        Toast.makeText(getActivity(), "Lose T_T", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClickNumber1(View view) {
        mGamePresenter.inputPlayerData(1);
    }

    @Override
    public void onClickNumber2(View view) {
        mGamePresenter.inputPlayerData(2);
    }

    @Override
    public void onClickNumber3(View view) {
        mGamePresenter.inputPlayerData(3);
    }

    @Override
    public void onClickNumber4(View view) {
        mGamePresenter.inputPlayerData(4);
    }

    @Override
    public void onClickNumber5(View view) {
        mGamePresenter.inputPlayerData(5);
    }

    @Override
    public void onClickNumber6(View view) {
        mGamePresenter.inputPlayerData(6);
    }

    @Override
    public void onClickNumber7(View view) {
        mGamePresenter.inputPlayerData(7);
    }

    @Override
    public void onClickNumber8(View view) {
        mGamePresenter.inputPlayerData(8);
    }

    @Override
    public void onClickNumber9(View view) {
        mGamePresenter.inputPlayerData(9);
    }

    @Override
    public void onClickBack(View view) {
        mGamePresenter.backPlayerData();
    }

    @Override
    public void onClickEnter(View view) {
        mGamePresenter.calcGameData();
    }

}

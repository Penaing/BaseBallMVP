package com.example.android.bullsandcows.scenes.game;

import com.example.android.bullsandcows.scenes.common.BaseContractor;

/**
 * Created by Pena on 2017-05-10.
 */
public interface GameContractor {

    interface View extends BaseContractor.BaseView<Presenter> {

    }

    interface Presenter extends BaseContractor.BasePresenter {

    }

}

package com.example.android.bullsandcows.Game.scene.login;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.bullsandcows.Game.scene.common.BaseActivity;
import com.example.android.bullsandcows.R;
import com.example.android.bullsandcows.databinding.ActivityMainBinding;

import java.util.List;

/**
 * Created by Pena on 2017-04-29.
 */
public class LoginActivity extends BaseActivity implements LoginContracter.View, aaa.map.MpaViewHandler, View.OnClickListener {

    ActivityMainBinding binding;

    LoginPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.mapView.setHandler(this, id, data) ;
        mPresenter = new LoginPresenter(this, this);

        ListView lv = null ;

        lv.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {

    }

    class myAdapter extends ArrayAdapter<String>
    {

        public myAdapter(Context context, int resource, int textViewResourceId, List<String> objects) {
            super(context, resource, textViewResourceId, objects);
            getItem(9 );
        }
    }

    @Override
    public String getId() {
        return binding.idEdt.getText().toString();
    }

    @Override
    public void onLoginSucess() {

    }

    @Override
    public void onLoginFaile() {

    }
}

package com.example.akshay.andarchex.UIController;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.akshay.andarchex.R;
import com.example.akshay.andarchex.Repository.NodeViewModel;

public class MainActivity extends AppCompatActivity {

    private NodeViewModel mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mModel = ViewModelProviders.of(this).get(NodeViewModel.class);

        final Observer<Boolean> isReadyObserver = new Observer<Boolean>() {
            @Override
            public void onChanged(@Nullable Boolean aBoolean) {
                // Change Button color
            }
        };

        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                // Change Button text
            }
        };

        // Connect observers to live data via methods defined in ViewModel
        mModel.getNextState().observe(this, nameObserver);
        mModel.isReady().observe(this, isReadyObserver);
    }
}

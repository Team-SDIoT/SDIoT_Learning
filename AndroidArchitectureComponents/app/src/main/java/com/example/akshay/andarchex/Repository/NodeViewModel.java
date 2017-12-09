package com.example.akshay.andarchex.Repository;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by Akshay on 09-12-2017.
 */

public class NodeViewModel extends ViewModel {
    private MutableLiveData<String> mCurrentState;
    private MutableLiveData<String> mNextState;
    private MutableLiveData<Boolean> mIsReady;

    public MutableLiveData<Boolean> isReady(){
        if(mCurrentState.equals(mNextState))
            mIsReady.setValue(true);
        else
            mIsReady.setValue(false);
        return mIsReady;
    }

    public MutableLiveData<String> getNextState() {
        return mNextState;
    }
}

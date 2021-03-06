package com.example.designpattern.actionType.statePattern;

import android.util.Log;

public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        Log.d("__PowerOnState","nextChannel");
    }

    @Override
    public void preChannel() {
        Log.d("__PowerOnState","preChannel");

    }

    @Override
    public void turnUp() {
        Log.d("__PowerOnState","turnUp");

    }

    @Override
    public void turnDown() {
        Log.d("__PowerOnState","turnDown");

    }
}

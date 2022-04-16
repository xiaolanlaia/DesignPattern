package com.example.designpattern.actionType.commandPattern.exam;

import android.util.Log;

public class Stock {
    private String name = "ABC";
    private int quality = 10;

    public void buy(){
        Log.d("__Stock-buy","name = "+name + " quality = "+quality);
    }

    public void shell(){
        Log.d("__Stock-shell","name = "+name + " quality = "+quality);
    }
}

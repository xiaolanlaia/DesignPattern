package com.example.designpattern.actionType.templatePattern;

import android.util.Log;

public class CoderComputer extends AbstractComputer {

    @Override
    protected void login() {
//        super.login();
        Log.d("__CoderComputer","login");
    }
}

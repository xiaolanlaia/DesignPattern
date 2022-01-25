package com.example.designpattern.mediator.exam;

import android.util.Log;

public class ChatRoom {
    public static void showMessage(User user,String message){
        Log.d("__showMessage","user = "+user.getName() + " message = "+message);
    }
}

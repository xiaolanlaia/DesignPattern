package com.example.designpattern.StructureType.proxyPattern;

import android.util.Log;

public class RealSubject extends Subject{
    @Override
    public void visit() {
        Log.d("__visit","RealSubject");
    }
}

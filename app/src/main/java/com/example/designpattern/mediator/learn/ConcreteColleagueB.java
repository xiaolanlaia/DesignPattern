package com.example.designpattern.mediator.learn;

import android.util.Log;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator){
        super(mediator);
    }
    @Override
    public void action() {
        Log.d("__action","ConcreteColleagueB");
    }
}

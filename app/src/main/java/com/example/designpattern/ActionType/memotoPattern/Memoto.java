package com.example.designpattern.ActionType.memotoPattern;

public class Memoto {
    public int checkPoint;
    public int lifeValue;
    public String weapon;

    @Override
    public String toString() {
        return "Memoto{" +
                "checkPoint=" + checkPoint +
                ", lifeValue=" + lifeValue +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
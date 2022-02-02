package com.example.designpattern.bridgePattern.example;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle [ color: green, radius: "+radius+", x: "+x+", y: "+y);

    }
}

package com.example.designpattern.StructureType.adapterPattern.learn;

public class VoltAdapter extends Volt220 implements FiveVolt{
    @Override
    public int getVolt5() {
        return 5;
    }
}

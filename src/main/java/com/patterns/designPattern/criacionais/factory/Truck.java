package com.patterns.designPattern.criacionais.factory;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by road");
    }
}

package com.patterns.designPattern.criacionais.factory;

public class RoadLogistics  extends Logistics{
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}

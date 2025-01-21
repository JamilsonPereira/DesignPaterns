package com.patterns.designPattern.criacionais.factory;

public class ShipLogistics extends Logistics{
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}

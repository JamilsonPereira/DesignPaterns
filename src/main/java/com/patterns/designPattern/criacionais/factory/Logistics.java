package com.patterns.designPattern.criacionais.factory;

public abstract class Logistics {
    public void planDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }

    protected abstract Transport createTransport();
}

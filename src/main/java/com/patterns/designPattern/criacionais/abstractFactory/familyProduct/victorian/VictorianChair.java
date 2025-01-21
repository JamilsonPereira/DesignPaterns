package com.patterns.designPattern.criacionais.abstractFactory.familyProduct.victorian;

import com.patterns.designPattern.criacionais.abstractFactory.product.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("is a Victorian chair");
    }

    @Override
    public boolean hasleg() {
        return true;
    }
}

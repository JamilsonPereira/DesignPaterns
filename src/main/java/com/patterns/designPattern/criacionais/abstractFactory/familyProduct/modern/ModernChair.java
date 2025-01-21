package com.patterns.designPattern.criacionais.abstractFactory.familyProduct.modern;

import com.patterns.designPattern.criacionais.abstractFactory.product.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("is a modern Chair");
    }

    @Override
    public boolean hasleg() {
        return true;
    }
}

package com.patterns.designPattern.criacionais.abstractFactory.familyProduct.modern;

import com.patterns.designPattern.criacionais.abstractFactory.product.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("is a modern Sofa");
    }

    @Override
    public String getStyle() {
        return "Modern Style";
    }
}

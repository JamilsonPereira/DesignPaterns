package com.patterns.designPattern.criacionais.abstractFactory.familyProduct.victorian;

import com.patterns.designPattern.criacionais.abstractFactory.product.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("is a Victorian Sofa");
    }

    @Override
    public String getStyle() {
        return "Style Victorian";
    }
}

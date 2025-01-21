package com.patterns.designPattern.criacionais.abstractFactory.factory;

import com.patterns.designPattern.criacionais.abstractFactory.familyProduct.modern.ModernSofa;
import com.patterns.designPattern.criacionais.abstractFactory.familyProduct.victorian.VictorianChair;
import com.patterns.designPattern.criacionais.abstractFactory.familyProduct.victorian.VictorianSofa;
import com.patterns.designPattern.criacionais.abstractFactory.product.Chair;
import com.patterns.designPattern.criacionais.abstractFactory.product.Sofa;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

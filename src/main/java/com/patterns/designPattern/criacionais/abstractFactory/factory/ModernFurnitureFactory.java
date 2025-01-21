package com.patterns.designPattern.criacionais.abstractFactory.factory;

import com.patterns.designPattern.criacionais.abstractFactory.familyProduct.modern.ModernChair;
import com.patterns.designPattern.criacionais.abstractFactory.familyProduct.modern.ModernSofa;
import com.patterns.designPattern.criacionais.abstractFactory.product.Chair;
import com.patterns.designPattern.criacionais.abstractFactory.product.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

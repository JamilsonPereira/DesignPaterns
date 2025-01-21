package com.patterns.designPattern.criacionais.abstractFactory.factory;

import com.patterns.designPattern.criacionais.abstractFactory.product.Chair;
import com.patterns.designPattern.criacionais.abstractFactory.product.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

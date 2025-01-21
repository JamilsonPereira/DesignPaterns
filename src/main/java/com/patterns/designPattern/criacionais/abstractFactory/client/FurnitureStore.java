package com.patterns.designPattern.criacionais.abstractFactory.client;

import com.patterns.designPattern.criacionais.abstractFactory.factory.FurnitureFactory;
import com.patterns.designPattern.criacionais.abstractFactory.product.Chair;
import com.patterns.designPattern.criacionais.abstractFactory.product.Sofa;

public class FurnitureStore {
    private final Chair chair;
    private final Sofa sofa;

    public FurnitureStore(FurnitureFactory furnitureFactory) {
        this.chair = furnitureFactory.createChair();
        this.sofa = furnitureFactory.createSofa();
    }

    public void showProducts(){
        chair.sitOn();
        sofa.lieOn();

        System.out.println("Estyle of sofa" + sofa.getStyle());
    }
}

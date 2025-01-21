package com.patterns.designPattern.criacionais.abstractFactory;

import com.patterns.designPattern.criacionais.abstractFactory.client.FurnitureStore;
import com.patterns.designPattern.criacionais.abstractFactory.factory.FurnitureFactory;
import com.patterns.designPattern.criacionais.abstractFactory.factory.ModernFurnitureFactory;
import com.patterns.designPattern.criacionais.abstractFactory.factory.VictorianFurnitureFactory;

public class MainAbstractFactory{

    public static void main(String[] args){
        FurnitureFactory furnitureModernFactory = new ModernFurnitureFactory();
        FurnitureStore furnitureStore = new FurnitureStore(furnitureModernFactory);

        System.out.println("Modern Store: ");
        furnitureStore.showProducts();

        FurnitureFactory furnitureVictorianFactory = new VictorianFurnitureFactory();
        FurnitureStore furnitureStore1 = new FurnitureStore(furnitureVictorianFactory);

        System.out.println("Victorian Store: ");

        furnitureStore1.showProducts();
    }
}

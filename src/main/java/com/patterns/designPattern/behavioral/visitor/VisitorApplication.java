package com.patterns.designPattern.behavioral.visitor;

public class VisitorApplication {

    public static void main(String[]args){
        ProductElement [] productElement = new ProductElement[]{
                new Eletronic("Iphone 16 pro max", 7150, 8000),
                new Clothing("Tenis Mizuno", 200, 400)
        } ;
        ProductVisitor profitCalculator = new ProfitCalculator();

        for(ProductElement productElement1: productElement){
            productElement1.accept(profitCalculator);
        }
    }
}

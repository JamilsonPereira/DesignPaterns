package com.patterns.designPattern.estructural.flyweight;

public class TextEditor {

    public static void main(String[] args) {
        CharFlyweightFactory factory = new CharFlyweightFactory();


        CharContext char1 = new CharContext(10, 20, factory.getCharFlyweight('A', "Arial", 12, "Preto"));
        CharContext char2 = new CharContext(15, 25, factory.getCharFlyweight('B', "Arial", 12, "Preto"));
        CharContext char3 = new CharContext(20, 30, factory.getCharFlyweight('A', "Arial", 12, "Preto"));
        CharContext char4 = new CharContext(25, 35, factory.getCharFlyweight('C', "Times New Roman", 14, "Vermelho"));

        char1.render();
        char2.render();
        char3.render();
        char4.render();


        System.out.println("Total de objetos Flyweight criados: " + factory.getFlyWeightCount());
    }
}

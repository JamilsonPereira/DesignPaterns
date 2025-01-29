package com.patterns.designPattern.estructural.flyweight;

public class CharFlyweight {
    private char character;
    private String font;
    private Integer size;
    private String color;

    public CharFlyweight(char character, String font, Integer size, String color) {
        this.character = character;
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public void render(int positionX, int positionY) {
        System.out.println("Renderizing char '" + character + "' font" + font + ", size" + size + ", color" + color + "at position: (" + positionX + ", " + positionY + ")");
    }
}

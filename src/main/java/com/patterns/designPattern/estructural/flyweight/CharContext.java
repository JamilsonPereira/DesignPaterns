package com.patterns.designPattern.estructural.flyweight;

public class CharContext {
    private int positionX;
    private int positionY;
    private CharFlyweight flyweight;

    public CharContext(int positionX, int positionY, CharFlyweight flyweight) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.flyweight = flyweight;
    }

    public void render() {
        flyweight.render(positionX, positionY);
    }
}

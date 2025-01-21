package com.patterns.designPattern.criacionais.prototype;

public class Circle extends Shape {

    public int radius;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + x + ", y=" + y + ", color='" + color + '\'' + ", radius=" + radius + '}';
    }
}

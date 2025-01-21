package com.patterns.designPattern.criacionais.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        // Lista para armazenar formas originais e clones
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        // Criando formas originais
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "Red";
        shapes.add(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 5;
        rectangle.y = 10;
        rectangle.width = 20;
        rectangle.height = 30;
        rectangle.color = "Blue";
        shapes.add(rectangle);

        // Clonando as formas
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        // Exibindo formas originais e suas cópias
        System.out.println("Formas Originais:");
        shapes.forEach(System.out::println);

        System.out.println("\nCópias Clonadas:");
        shapesCopy.forEach(System.out::println);
    }
}

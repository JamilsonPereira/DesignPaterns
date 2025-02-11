package com.patterns.designPattern.behavioral.visitor;

public interface ProductElement {
    void accept(ProductVisitor productVisitor);
}

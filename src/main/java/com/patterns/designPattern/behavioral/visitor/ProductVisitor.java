package com.patterns.designPattern.behavioral.visitor;

public interface ProductVisitor {
    void visitEletronics(Eletronic eletronic);
    void visitDress(Clothing clothing);
}

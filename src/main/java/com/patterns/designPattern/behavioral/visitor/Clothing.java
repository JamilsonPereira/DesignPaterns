package com.patterns.designPattern.behavioral.visitor;

import java.math.BigDecimal;

public class Clothing implements  ProductElement {
    private String name;
    private Integer priceBuy;
    private Integer priceSell;

    public Clothing(String name, Integer priceBuy, Integer priceSell) {
        this.name = name;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriceBuy() {
        return priceBuy;
    }

    public void setPriceBuy(Integer priceBuy) {
        this.priceBuy = priceBuy;
    }

    public Integer getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(Integer priceSell) {
        this.priceSell = priceSell;
    }

    @Override
    public void accept(ProductVisitor productVisitor) {
    productVisitor.visitDress(this);
    }
}

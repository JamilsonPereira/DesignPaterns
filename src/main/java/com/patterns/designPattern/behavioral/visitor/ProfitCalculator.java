package com.patterns.designPattern.behavioral.visitor;

public class ProfitCalculator implements ProductVisitor{
    @Override
    public void visitEletronics(Eletronic eletronic) {
        final int profit = eletronic.getPriceSell() - eletronic.getPriceBuy();
        System.out.println("Calculate value profit: " + profit);
    }

    @Override
    public void visitDress(Clothing clothing) {
     final int profitClothing = clothing.getPriceSell() - clothing.getPriceBuy();
        System.out.println("Calculate value profit clothing: " + profitClothing);
    }
}

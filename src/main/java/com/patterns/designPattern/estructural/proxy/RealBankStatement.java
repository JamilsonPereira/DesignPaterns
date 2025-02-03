package com.patterns.designPattern.estructural.proxy;

public class RealBankStatement implements BankStatement{

    private String customer;

    public RealBankStatement(String customer) {
        this.customer = customer;
        loadStatement();
    }

    private void loadStatement() {
        System.out.println("Load Statement for the customer: " + customer);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void showStatement() {
        System.out.println("Statement for the customer: " + customer);
    }
}

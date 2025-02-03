package com.patterns.designPattern.estructural.proxy;

public class BankStatementProxy implements BankStatement {
    private RealBankStatement realBankStatement;
    private String customer;
    boolean accessLowed;

    public BankStatementProxy(String customer, boolean accessLowed) {
        this.customer = customer;
        this.accessLowed = accessLowed;
    }


    @Override
    public void showStatement() {
        if (!accessLowed){
            System.out.println("Show the Statement for the client: " + customer);
        }

        if (realBankStatement == null){
            realBankStatement = new RealBankStatement(customer);
        }

        realBankStatement.showStatement();
    }
}

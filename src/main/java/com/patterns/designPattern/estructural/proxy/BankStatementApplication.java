package com.patterns.designPattern.estructural.proxy;

public class BankStatementApplication {

    public static void main(String[] args){
        System.out.println("Customer without permission access: ");
        BankStatement bankStatementWithoutPermissionAccess = new BankStatementProxy("James", false);
        bankStatementWithoutPermissionAccess.showStatement();

        System.out.println("Customer with permission access");
        BankStatement bankStatementWithAccess = new BankStatementProxy("Gabis", true);
        bankStatementWithAccess.showStatement();
    }
}

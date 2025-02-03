package com.patterns.designPattern.behavioral.chainOfResponsability;

public class FinalAuthorizationHandler extends TransactionHandler{


    @Override
    public void handle(Transaction transaction) {
        System.out.println("Transaction Approved");
        transaction.setApproved(true);
    }
}

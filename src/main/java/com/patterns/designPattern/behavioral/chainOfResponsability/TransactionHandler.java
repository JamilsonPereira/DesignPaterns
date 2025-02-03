package com.patterns.designPattern.behavioral.chainOfResponsability;

public abstract class TransactionHandler {

    protected  TransactionHandler nextTransactionHandler;

    public void setNextTransactionHandler(TransactionHandler nextTransactionHandler) {
        this.nextTransactionHandler = nextTransactionHandler;
    }
    public abstract void handle(Transaction transaction);
}

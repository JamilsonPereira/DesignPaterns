package com.patterns.designPattern.behavioral.chainOfResponsability;

public class PaymentProcessingSystem {
    public static void main(String[] args) {
        TransactionHandler balanceCheck = new BalanceCheckHandler();
        TransactionHandler fraudCheck = new FraudCheckHandler();
        TransactionHandler dailyLimit = new DailyLimitHandler();
        TransactionHandler finalAuthorization = new FinalAuthorizationHandler();


        balanceCheck.setNextTransactionHandler(fraudCheck);
        fraudCheck.setNextTransactionHandler(dailyLimit);
        dailyLimit.setNextTransactionHandler(finalAuthorization);


        Transaction transaction = new Transaction(300.0, "123-456");

        System.out.println("Starting transaction processing...");
        balanceCheck.handle(transaction);

        if (transaction.getApproved()) {
            System.out.println("Transaction completed successfully!");
        } else {
            System.out.println("Transaction not approved.");
        }
    }
}

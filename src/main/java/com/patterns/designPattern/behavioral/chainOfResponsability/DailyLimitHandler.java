package com.patterns.designPattern.behavioral.chainOfResponsability;

public class DailyLimitHandler extends TransactionHandler{
    @Override
    public void handle(Transaction transaction) {
        Double dailyLimit = getDailyLimit(transaction.getAccountId());
        if (transaction.getAmount() <= dailyLimit){
            System.out.println("Daily limit not exceeded.");
            if (nextTransactionHandler != null){
                nextTransactionHandler.handle(transaction);
            }
        }else {
            System.out.println("Transaction declined: Daily limit exceeded.");
        }
    }
    private Double getDailyLimit(String accountId) {
        // Simulação do limite diário
        return 500.0;
    }
}

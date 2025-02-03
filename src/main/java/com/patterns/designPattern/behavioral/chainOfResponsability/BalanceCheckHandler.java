package com.patterns.designPattern.behavioral.chainOfResponsability;

public class BalanceCheckHandler extends TransactionHandler{
    @Override
    public void handle(Transaction transaction) {
        Double currentBalance = getBalance(transaction.getAccountId());
        if(transaction.getAmount() <= currentBalance){
            System.out.println("Sufficient Balance");
            if(nextTransactionHandler != null){
                nextTransactionHandler.handle(transaction);
            }
        }else {
            System.out.println("Transaction declined: Insufficient balance.");
        }

    }

    private Double getBalance(String accountId) {
        // Simulação de saldo (por exemplo, consulta ao banco de dados)
        return 1000.0;
    }
}

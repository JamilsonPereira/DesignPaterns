package com.patterns.designPattern.behavioral.chainOfResponsability;

public class FraudCheckHandler extends TransactionHandler{
    @Override
    public void handle(Transaction transaction) {
        if(isFraudulent(transaction)){
            System.out.println("Transaction suspected of fraud.");
        } else {
            System.out.println("Approved risk analysis.");
            nextTransactionHandler.handle(transaction);
        }
    }

    private boolean isFraudulent(Transaction transaction) {
        // Simulação de checagem de fraude (poderia chamar um serviço externo)
        return false;
    }
}

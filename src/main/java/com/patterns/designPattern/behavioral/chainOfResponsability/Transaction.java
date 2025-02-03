package com.patterns.designPattern.behavioral.chainOfResponsability;

import lombok.Getter;

public class Transaction {

    @Getter
    private Double amount;
    @Getter
    private String accountId;
    private Boolean isApproved;

    public Transaction(Double amount, String accountId) {
        this.amount = amount;
        this.accountId = accountId;
    }

    public Boolean getApproved() {
        return isApproved;
    }

    public void setApproved(Boolean approved) {
        isApproved = approved;
    }
}

package com.patterns.designPattern.estructural.adapter;

public class PaymentPayPal implements PaymentProcessor{
    @Override
    public void executepayment(double amount) {
        System.out.println("Payment Paypal: " + amount);
    }
}

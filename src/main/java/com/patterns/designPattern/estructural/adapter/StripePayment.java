package com.patterns.designPattern.estructural.adapter;

public class StripePayment {
    void processStripePayment(double amount){
        System.out.println("Payment Stripe: " + amount);
    }
}

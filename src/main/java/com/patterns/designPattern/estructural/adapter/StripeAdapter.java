package com.patterns.designPattern.estructural.adapter;

public class StripeAdapter implements PaymentProcessor{
   private  StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void executepayment(double amount) {
        stripePayment.processStripePayment(amount);
    }
}

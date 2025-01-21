package com.patterns.designPattern.estructural.adapter;

public class PaymentSystem {
    public static void  main(String[] args){
        PaymentProcessor paymentProcessor = new PaymentPayPal();
        paymentProcessor.executepayment(10.0);


        StripePayment stripePayment = new StripePayment();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripePayment);
        stripeAdapter.executepayment(20.0);

        System.out.println("PayPal payment: " + paymentProcessor);
        System.out.println("Stripe Payment: " + stripePayment);
    }
}

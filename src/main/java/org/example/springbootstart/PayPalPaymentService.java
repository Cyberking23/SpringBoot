package org.example.springbootstart;

public class PayPalPaymentService implements PaymentService{


    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe");
        System.out.println("Amout "+amount);
    }
}

package com.crud.test.interview.design_pattern.strategy;

public class UpiPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payment done by Upi Payment");
    }
}

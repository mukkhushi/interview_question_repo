package com.crud.test.interview.design_pattern.strategy;

public class AnyOtherTypePayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment done via anyOtherTypePayment");
    }
}

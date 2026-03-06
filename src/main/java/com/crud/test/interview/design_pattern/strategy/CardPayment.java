package com.crud.test.interview.design_pattern.strategy;

public class CardPayment implements PaymentStrategy{
        @Override
        public void pay() {
            System.out.println("Payment done by Card Payment");
        }
}

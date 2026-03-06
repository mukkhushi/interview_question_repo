package com.crud.test.interview.design_pattern.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        new StrategyContext(new UpiPayment()).executePayment();
        new StrategyContext(new CardPayment()).executePayment();
        new StrategyContext(new AnyOtherTypePayment()).executePayment();
    }
}

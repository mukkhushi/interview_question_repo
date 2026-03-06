package com.crud.test.interview.design_pattern.strategy;

public class StrategyContext {
   private PaymentStrategy paymentStrategy;
   StrategyContext(PaymentStrategy paymentStrategy){
       this.paymentStrategy = paymentStrategy;
   }

   public void executePayment(){
       paymentStrategy.pay();
   }
}

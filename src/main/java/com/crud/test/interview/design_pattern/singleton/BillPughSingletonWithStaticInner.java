package com.crud.test.interview.design_pattern.singleton;

public class BillPughSingletonWithStaticInner {

    private BillPughSingletonWithStaticInner(){

    }

    private static class ABC{
        private static BillPughSingletonWithStaticInner INSTANCE = new BillPughSingletonWithStaticInner();
    }

    public static BillPughSingletonWithStaticInner getInstance(){
        return ABC.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());

    }
}

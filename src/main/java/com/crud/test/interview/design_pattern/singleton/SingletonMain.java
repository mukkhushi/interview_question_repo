package com.crud.test.interview.design_pattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("1st Time"+singleton);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("2nd time"+singleton2);
    }
}

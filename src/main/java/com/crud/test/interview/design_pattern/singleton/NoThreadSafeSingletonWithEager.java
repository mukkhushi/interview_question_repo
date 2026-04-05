package com.crud.test.interview.design_pattern.singleton;

public class NoThreadSafeSingletonWithEager {
    private static NoThreadSafeSingletonWithEager instance = new NoThreadSafeSingletonWithEager();
    private NoThreadSafeSingletonWithEager(){

    }
    public static NoThreadSafeSingletonWithEager getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());

    }
}

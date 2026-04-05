package com.crud.test.interview.design_pattern.singleton;

public class NoThreadSafeSingletonWithLazy {

    private static NoThreadSafeSingletonWithLazy instance = null;
    private NoThreadSafeSingletonWithLazy(){}
    public static NoThreadSafeSingletonWithLazy getInstance(){
        if(instance == null)
            instance = new NoThreadSafeSingletonWithLazy();
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}

package com.crud.test.interview.design_pattern.singleton;

public class ThreadSafeSingletonWithSyncMethod {
    private static ThreadSafeSingletonWithSyncMethod instance;
    private ThreadSafeSingletonWithSyncMethod(){

    }
    public static synchronized ThreadSafeSingletonWithSyncMethod getInstance(){
        if(instance == null)
             instance = new ThreadSafeSingletonWithSyncMethod();
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());

    }
}

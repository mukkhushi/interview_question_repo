package com.crud.test.interview.design_pattern.singleton;

public class DoubleLockCheckSingletonWithSyncBlock {
    private static DoubleLockCheckSingletonWithSyncBlock instance = null;
    private DoubleLockCheckSingletonWithSyncBlock(){

    }
    public static DoubleLockCheckSingletonWithSyncBlock getInstance(){
        if(instance == null){
            synchronized (DoubleLockCheckSingletonWithSyncBlock.class){
                if(instance == null){
                    instance = new DoubleLockCheckSingletonWithSyncBlock();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DoubleLockCheckSingletonWithSyncBlock singleton = DoubleLockCheckSingletonWithSyncBlock.getInstance();
        System.out.println("1st Time"+singleton);
        DoubleLockCheckSingletonWithSyncBlock singleton2 = DoubleLockCheckSingletonWithSyncBlock.getInstance();
        System.out.println("2nd time"+singleton2);
    }
}

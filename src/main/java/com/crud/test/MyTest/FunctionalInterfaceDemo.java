package com.crud.test.MyTest;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
    public void method();
    default void m2(){
        System.out.println("default");
    }
}

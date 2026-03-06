package com.crud.test.interview.generic_demo.gmethod;


public class GenericMethodSum {

    public static <T extends Number>double sum(T value1, T value2){
         return value1.doubleValue() + value2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2.0,3.0));
        System.out.println(sum(22,34d));
    }
}

package com.crud.test.interview.generic_demo.gclass;

public class GenericMain {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(1);
        System.out.println(integerBox.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Mukesh");
        System.out.println(stringBox.getValue());
    }
}

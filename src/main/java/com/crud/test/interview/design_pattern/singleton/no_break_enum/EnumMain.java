package com.crud.test.interview.design_pattern.singleton.no_break_enum;

public class EnumMain {
    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;

        System.out.println(enumSingleton1.hashCode());
        System.out.println(enumSingleton2.hashCode());

    }
}

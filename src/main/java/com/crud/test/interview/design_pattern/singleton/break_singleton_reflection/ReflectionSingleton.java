package com.crud.test.interview.design_pattern.singleton.break_singleton_reflection;

public class ReflectionSingleton {
    public static ReflectionSingleton instance = new ReflectionSingleton();
    private ReflectionSingleton(){
        try {
            if (instance != null) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

}


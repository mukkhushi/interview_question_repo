package com.crud.test.interview.design_pattern.singleton.break_singleton_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionMain {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = ReflectionSingleton.class.getDeclaredConstructors();
        constructors[0].setAccessible(true);
        //Object reflectionSingleton = constructors[0].newInstance();
        System.out.println(ReflectionSingleton.instance.hashCode());
        //System.out.println(reflectionSingleton.hashCode());
    }
}

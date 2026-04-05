package com.crud.test.interview.design_pattern.singleton.break_singleton_cloneable;

public class CloneableSingleton extends SuperClass {
    public static CloneableSingleton instance = new CloneableSingleton();
    private CloneableSingleton(){}

    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
        //return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
       CloneableSingleton instance1 = CloneableSingleton.instance;
       CloneableSingleton instance2 = (CloneableSingleton) instance1.clone();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

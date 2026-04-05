package com.crud.test.interview.design_pattern.singleton.break_singleton_cloneable;

public class SuperClass implements  Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
            return super.clone();
    }
}

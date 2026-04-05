package com.crud.test.interview.design_pattern.singleton.break_singleton_serializable;

import java.io.*;

public class SerializableSingleton implements Serializable {
    private static SerializableSingleton instance = new SerializableSingleton();
    private SerializableSingleton(){

    }
    public static SerializableSingleton getInstance(){
        return  instance;
    }

    @Serial
    protected Object readResolve() { return instance; }
}

package com.crud.test.interview.design_pattern.singleton.break_singleton_serializable;

import java.io.*;

public class SerializableMain {
    public static void main(String[] args) {
        SerializableSingleton instance1 = null;
        SerializableSingleton instance2 = null;

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mukesh Kumar\\OneDrive\\Desktop\\MyFile\\file.txt"));
            instance1 = SerializableSingleton.getInstance();
            out.writeObject(instance1);
        }catch(IOException e){

        }

        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\Mukesh Kumar\\OneDrive\\Desktop\\MyFile\\file.txt"));
            instance2 = (SerializableSingleton) input.readObject();
        } catch(IOException e){

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

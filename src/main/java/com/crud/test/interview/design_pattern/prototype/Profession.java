package com.crud.test.interview.design_pattern.prototype;

public abstract class Profession implements Cloneable{
    Integer id;
    String name;
    public abstract void printProfession();

    @Override
    public Profession clone() {
        try {
            Profession clone = (Profession) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /*public Object cloneMethod()  {
        Object clone = null;
        try {
            clone =  super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
         return clone;
    }*/
}

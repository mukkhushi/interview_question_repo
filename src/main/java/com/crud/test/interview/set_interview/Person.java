package com.crud.test.interview.set_interview;

import java.util.Objects;

public class Person {
    private  int id;
    private  int age;
    private  String name;

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Person(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
   public String toString(){
        return id+" "+name+" "+age;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name,age);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return this.id == p.id && this.age == p.age && this.name.equals(p.name);
    }
}

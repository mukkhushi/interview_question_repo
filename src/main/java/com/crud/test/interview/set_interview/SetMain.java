package com.crud.test.interview.set_interview;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        Person person1 = new Person(1, 22, "Ravi1");
        Person person2 = new Person(2, 23, "Ravi2");
        Person person3 = new Person(3, 24, "Ravi3");
        Person person4 = new Person(1, 22, "Ravi1");
        Person person5 = new Person(1, 22, "Ravi1");
        Person person6 = new Person(1, 27, "Ravi1");

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

//        for(Person s:personSet){
//            personSet.add(new Person(1,23,"kkk"));
//            System.out.println(s);
//        }


        //List<Person> list = new ArrayList<>(set);
        List<Person> personList = personSet.stream().toList();
        Comparator<Person> nameComparator = (p1,p2)->p1.getName().compareTo(p2.getName());
        //Comparator<Person> nameAgeComparator = nameComparator.thenComparing((p1,p2)->p1.getAge()-p2.getAge());
        personList.stream().sorted(nameComparator).forEach(System.out::println);
        //Collections.sort(personList,nameComparator); // can't sort because toList return unmodified List

    }
}

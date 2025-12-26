package com.crud.test.MyTest;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceDemo fid = ()->System.out.println("Hello");
        fid.method();

        List<Integer> integerList = List.of(12,13,14,22,15,2636362,16,25);
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = integerList.stream()
                        .filter(i->!set.add(i))
                                .toList();
        System.out.println(duplicates);

        integerList.stream()
                .map(String::valueOf)
                .filter(p->String.valueOf(p.charAt(0)).equals("2") && String.valueOf(p.charAt(p.length()-1)).equals("2"))
                .forEach(i->System.out.println(i));



    }
}

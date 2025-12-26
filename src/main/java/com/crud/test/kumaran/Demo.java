package com.crud.test.kumaran;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        String str="programming"; //o/p = poain

        Map<Character,Long> maps = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        String s = maps.entrySet()
                .stream().filter(v->v.getValue()==1)
                .map(k->k.getKey().toString())
                .collect(Collectors.joining());

        System.out.println(s);


    }
}

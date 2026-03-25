package com.crud.test.interview.stream.string;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = List.of("qw","abd","asdf","xyz");
        Map<Integer,String> maps = list.stream().collect(Collectors.toMap(String::length,x->x,(a,b)->a+","+b));
        System.out.println(maps);
    }
}

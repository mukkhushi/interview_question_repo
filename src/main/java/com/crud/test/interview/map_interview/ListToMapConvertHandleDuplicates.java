package com.crud.test.interview.map_interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConvertHandleDuplicates {
    public static void main(String[] args) {
        List<String> stringList  = List.of("Mukesh","Rakeshk","abc","xyz");
        //Map<Integer,List<String>> maps  = stringList.stream().collect(Collectors.groupingBy(a->a.length()));
        Map<Integer,String> map = new HashMap<>();

        map = stringList.stream().collect(Collectors.toMap(String::length,a->a
        ,(a1,a2)->a1 +","+a2
        ));
        System.out.println(map);

    }
}

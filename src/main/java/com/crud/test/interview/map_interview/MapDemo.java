package com.crud.test.interview.map_interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 10);
        unsortedMap.put("Orange", 5);
        unsortedMap.put("Banana", 20);
        unsortedMap.put("Grape", 15);
        //Sort by values in java 8

        System.out.println("Unsorted Map:"+unsortedMap);
        //Method 1 (Order by only key)
        //Map<String,Integer> sortedMap = new TreeMap<>(unsortedMap);

        //Method 2
        /*unsortedMap.entrySet()
                .stream()
                .sorted((m1,m2)->m1.getKey().compareTo(m2.getKey()))
                //.sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);*/

        //Method 3
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(p->{
                    sortedMap.put(p.getKey(), p.getValue());
                });

        System.out.println("Sorted Map:"+sortedMap);


    }
}

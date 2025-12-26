package com.crud.test.interview.string_interview.practices;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigramFrequency {
    public static void main(String[] args) {
        String str = "java is fun java is powerful";
        //List<String> newList = new ArrayList<>();
        List<String> newList = List.of(str.split(" "));
        Map<String,Long> maps = IntStream.range(0,newList.size()-1)
                .mapToObj(i->newList.get(i)+" "+newList.get(i+1))
                .collect(Collectors.groupingBy(a->a,Collectors.counting()));

        System.out.println(maps);
    }

}

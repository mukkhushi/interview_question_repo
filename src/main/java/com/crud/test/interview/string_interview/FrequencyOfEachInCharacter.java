package com.crud.test.interview.string_interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FrequencyOfEachInCharacter {
    public static void main(String[] args) {
        String str = "mukeshhkumar";
        Map<Character,Long> maps = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(maps);
    }
}

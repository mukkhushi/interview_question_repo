package com.crud.test.interview.string_interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "I like Java";
        String firstNonRepeatChar = Arrays.stream(str.replaceAll("\\s","")
                .toLowerCase()
                .split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(k->k.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst().get();

        Character maxRepeatChar = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .get().getKey();

        System.out.println("firstNonRepeatChar = "+firstNonRepeatChar);
        System.out.println("maxRepeatChar = "+maxRepeatChar);
    }
}

package com.crud.test.interview.number_interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachNumberInArray {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(2, 3, 4, 54, 4, 5, 56, 7, 6, 7);
        Map<Integer, Long> maps = integerList
                .stream()
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        System.out.println(maps);
    }

}

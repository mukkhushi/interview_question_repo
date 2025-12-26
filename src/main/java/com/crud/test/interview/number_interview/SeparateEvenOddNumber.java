package com.crud.test.interview.number_interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEvenOddNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(6,4,3,2,1);
       Map<Boolean,List<Integer>> maps =  list.stream()
                .collect(
                        Collectors.partitioningBy(i->i%2==0)
                );
       System.out.println(maps);
    }
}

package com.crud.test.interview.string_interview;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupStringByHisLength {
    public static void main(String[] args) {
        Map<Integer,Long> maps = Stream.of("ab","abv","bgt","kkkk","jj","khggg")
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(maps);
    }
}

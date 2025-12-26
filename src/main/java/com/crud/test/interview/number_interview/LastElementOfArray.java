package com.crud.test.interview.number_interview;

import java.util.List;

public class LastElementOfArray {
    public static void main(String[] args) {
        List<Integer> list =List.of(2,11,1,5,6,12);
        list
                .stream()
                .skip(list.size()-1).forEach(System.out::println);

    }
}

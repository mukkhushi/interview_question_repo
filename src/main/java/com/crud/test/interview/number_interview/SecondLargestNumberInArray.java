package com.crud.test.interview.number_interview;

import java.util.Comparator;
import java.util.stream.Stream;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        Stream.of(3,5,6,71,4,45)
                .sorted(Comparator.reverseOrder())
                .skip(1).forEach(System.out::println);
    }
}

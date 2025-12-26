package com.crud.test.interview.number_interview;

import java.util.stream.Stream;

public class SumAllDigit {
    public static void main(String[] args) {
        Integer num = 2344;
        Integer sum = Stream.of(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt).sum();
        System.out.println(sum);

    }
}

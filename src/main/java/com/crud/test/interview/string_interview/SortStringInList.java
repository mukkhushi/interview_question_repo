package com.crud.test.interview.string_interview;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringInList {
    public static void main(String[] args) {
        //sorted based on alphabetical order
        /* String sortedString = Stream.of("abfsadfs","poor","bcdeee","eeert")
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(",")); */

        //sorted based of string length
        String sortedString2 = Stream.of("ab","poor","bcdeee","eeert")
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.joining(","));


        System.out.println(sortedString2);

    }
}

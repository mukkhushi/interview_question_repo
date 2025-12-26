package com.crud.test.interview.string_interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String str = "mukeshkumar";//mukeshar
        String newStr = Stream.of(str.split(""))
                .distinct()
                .collect(Collectors.joining());
        System.out.println(newStr);
    }
}

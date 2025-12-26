package com.crud.test.interview.string_interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachStringInString {
    public static void main(String[] args) {
        String str = "Mukesh Kumar";
        String newStr = Arrays.stream(str.split(" "))
                .map(s->new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(newStr);



    }
}

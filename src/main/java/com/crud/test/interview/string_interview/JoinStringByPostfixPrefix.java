package com.crud.test.interview.string_interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinStringByPostfixPrefix {
    public static void main(String[] args) {
        String str = "mukesh kumar";
        //String newStr = String.join(" ","Mr.",str);//by prefix only
        String newStr = Stream.of(str.split(" "))
                        .collect(Collectors.joining(" ","Mr."," musup"));

        System.out.println(newStr);

    }
}

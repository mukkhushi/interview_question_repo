package com.crud.test.interview.string_interview;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsecutiveNonRepeatingChar {
    public static void main(String[] args) {
        String str2 = "aaxxshhhhhyydhiiii";
        String nonRepeatChar = IntStream.range(0, str2.length())
                .filter(
                        i->(i == 0 || str2.charAt(i) != str2.charAt(i-1))
                         && (i == str2.length()-1 || str2.charAt(i) != str2.charAt(i+1)
                        )
                )
                .mapToObj(str2::charAt)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(nonRepeatChar);

    }
}

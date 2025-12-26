package com.crud.test.interview.string_interview;

import java.util.stream.IntStream;

public class ConsecutiveRepeatingCharacter {
    public static void main(String[] args) {
        String s = "helloohefyyg";
        IntStream.range(0,s.length())
            .filter(i-> (i == 0 || s.charAt(i) == s.charAt(i - 1))
                    || (i == s.length()-1 || s.charAt(i) == s.charAt(i + 1))
            )
            .filter(p->p!=0 && p!=s.length()-1)
            .mapToObj(i->(char)s.charAt(i))
            .distinct()
            .forEach(System.out::println);


    }
}

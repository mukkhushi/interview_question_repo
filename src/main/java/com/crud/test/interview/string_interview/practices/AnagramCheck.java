package com.crud.test.interview.string_interview.practices;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramCheck {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Anagram Check Using Stream API"+Stream.of(str1.split("")).sorted().toList());
        System.out.println("Anagram Check Using Stream API"+Stream.of(str2.split("")).sorted().toList());
        String sl1 = Stream.of(str1.split("")).sorted().collect(Collectors.joining());
        String sl2 = Stream.of(str2.split("")).sorted().collect(Collectors.joining());
        if(sl1.equalsIgnoreCase(sl2))
            System.out.println("Anagram");
         else
            System.out.println("Not Anagram");
    }
}

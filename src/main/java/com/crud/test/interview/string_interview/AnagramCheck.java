package com.crud.test.interview.string_interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "saailenbbt";
        String sl1 = Arrays.stream(s1.toLowerCase().split("")).sorted().collect(Collectors.joining());
        //String sl1 = s1.toLowerCase().chars().sorted().mapToObj(c->(char)c).map(String::valueOf).collect(Collectors.joining());
        String sl2 = s2.toLowerCase().chars().sorted().mapToObj(c->(char)c).map(String::valueOf).collect(Collectors.joining());
        if(sl1.equalsIgnoreCase(sl2))
            System.out.println("Anagram");
         else
            System.out.println("Not Anagram");
    }

}

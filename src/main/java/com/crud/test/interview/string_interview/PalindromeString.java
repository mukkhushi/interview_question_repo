package com.crud.test.interview.string_interview;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        //1st way
        System.out.println(
                (new StringBuilder(str).compareTo(new StringBuilder(str).reverse()) == 0) ?"Palindrome":"Not palindrome"
        );
        //2nd way
        System.out.println(
        IntStream.range(0,str.length()/2)
                .noneMatch(s->str.charAt(s)!=str.charAt(str.length()-s-1))
        ?"P":"N");

        //3rd
        String s= "mukesh";
        //o/p hsekum
        String revString = IntStream.range(0,s.length())
                .mapToObj(i->s.charAt(s.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(s.equals(revString)?"P":"Not P");
        
    }
}

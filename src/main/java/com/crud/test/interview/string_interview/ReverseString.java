package com.crud.test.interview.string_interview;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        //traditional approach
        String str = "Mukesh";
        char c[] = str.toCharArray();
        int i=0,j=str.length()-1;
        while(i<j){
            char t;
            t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++; j--;
        }
        System.out.println(new String(c));

        //by using stream
        String newRevStr = IntStream.range(0,str.length())
                .mapToObj(k->str.charAt(str.length()-k-1))
                .map(String::valueOf).collect(Collectors.joining());

        System.out.println(newRevStr);
    }
}

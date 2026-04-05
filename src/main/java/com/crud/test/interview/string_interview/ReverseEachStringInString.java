package com.crud.test.interview.string_interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseEachStringInString {
    public static void main(String[] args) {
        String str = "Mukesh Kumar";
        String newStr = Arrays.stream(str.split(" "))
                .map(s->new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));

        /*String s = "Mukesh Kumar Sharma";
        List<String> stringList = List.of(s.split(" "));

        String rev = IntStream.range(0,stringList.size())
                .mapToObj(i->stringList.get(stringList.size()-1-i))
                .collect(Collectors.joining(" "));*/

        System.out.println(newStr);



    }
}

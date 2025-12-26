package com.crud.test.interview.string_interview;

import java.util.List;
import java.util.stream.Stream;

public class FindStringStartWithDigit {
    public static void main(String[] args) {
        List<String> strList = Stream.of("ghty","tyu","6wert","fhhhh","5rtyyu")
                .filter(s->!Character.isDigit(s.charAt(0)))
                .toList();
        System.out.println(strList);

    }
}

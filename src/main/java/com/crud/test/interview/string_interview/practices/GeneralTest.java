package com.crud.test.interview.string_interview.practices;

import java.util.stream.Stream;

public class GeneralTest {
    public static void main(String[] args) {
        Stream.iterate(5,i->i+5)
                .limit(10)
                .forEach(p-> System.out.print(p+","));
    }
}

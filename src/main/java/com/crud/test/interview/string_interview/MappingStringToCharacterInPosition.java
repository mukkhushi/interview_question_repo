package com.crud.test.interview.string_interview;

import java.util.List;
import java.util.stream.Stream;

public class MappingStringToCharacterInPosition {
    public static void main(String[] args) {
        List<List<String>> stringList = List.of(List.of("ab","bc"),List.of("de","ef"),List.of("xy"));
        stringList.stream()
                .flatMap(List::stream)
                .flatMap(p->Stream.of(p.charAt(0)))
                .forEach(System.out::println);
    }

}

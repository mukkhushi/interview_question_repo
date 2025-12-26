package com.crud.test.interview.string_interview;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigramFrequency {
    public static void main(String[] args) {
        String s = "Java is great and java is fun and java is powerful language";
        String[] words = s.split(" ");
        //List<String> wordList = List.of(words);
        Map<String, Long> maps = IntStream.range(0,words.length-1)
                .mapToObj(i->words[i]+" "+words[i+1])
                .toList()
                .stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));

        System.out.println(maps);
    }
}

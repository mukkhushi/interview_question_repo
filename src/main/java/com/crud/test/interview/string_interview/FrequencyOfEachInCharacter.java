package com.crud.test.interview.string_interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FrequencyOfEachInCharacter {
    public static void main(String[] args) {
        /*String str = "mukeshhkumar";
        Map<Character,Long> maps = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(maps);
*/
        Stream.iterate(new int[]{0,1}, f->new int[]{f[1],f[0]+f[1]})
                .limit(10)
                .map(m->m[0])
                .forEach(s->System.out.print(s+","));
    }
}

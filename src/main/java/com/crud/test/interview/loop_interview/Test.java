package com.crud.test.interview.loop_interview;

import java.util.*;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(10,20,40,60);
        int w = 2;
       Double sum = IntStream.range(0,integerList.size()-1)
                .mapToObj(i->integerList.subList(i,integerList.size()-(w-i)))
                .mapToInt(j->j.stream().mapToInt(k->k).sum())
                .max().stream().average().orElse(0.0);

        System.out.println(sum);
    }
}

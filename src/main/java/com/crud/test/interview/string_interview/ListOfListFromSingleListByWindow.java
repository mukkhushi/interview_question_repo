package com.crud.test.interview.string_interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ListOfListFromSingleListByWindow {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6};
        int w = 4;
        int[]avg = {2,3,4,5};

        List<Integer> ai = Arrays.stream(a).boxed().toList();

        List<List<Integer>> il = IntStream.range(0,a.length-(w-1))
                .mapToObj(i->ai.subList(i,w+i))
                .map(m->m.stream()
                        .mapToInt(i->i)
                        .boxed().toList())
                .toList();
        System.out.println(il);
    }
}

package com.crud.test.interview.number_interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArray {
    public static void main(String[] args) {
        List<Integer> ia = Arrays.asList(4,5,16,2,13);
        List<Integer> ib = Arrays.asList(14,15,6,12,13);

        //IntStream is = ia.stream().mapToInt(s->s);
        //Stream<Integer> si = is.boxed();



        List<Integer> mergeList = IntStream.concat(ia.stream().mapToInt(m->m).sorted().distinct(),
                        ib.stream().mapToInt(b->b).sorted().distinct())
                .boxed()
                .toList();

        System.out.println(mergeList);

    }
}

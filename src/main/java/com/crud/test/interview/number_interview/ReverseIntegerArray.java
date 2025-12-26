package com.crud.test.interview.number_interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int x[] = {2,3,3,4,5,6};
        int y[] = IntStream.range(1,x.length)
                .map(i->x[x.length-i])
                .toArray();
        Arrays.stream(y).forEach(System.out::println);

        //List<Integer> list = Arrays.stream(x).boxed().toList().reversed();
    }
}

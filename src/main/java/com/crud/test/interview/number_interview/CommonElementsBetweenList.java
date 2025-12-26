package com.crud.test.interview.number_interview;

import java.util.Arrays;
import java.util.List;

public class CommonElementsBetweenList {
    public static void main(String[] args) {
        int[]a={6,4,5,6,6,4};
        int[]b={2,3,5,6,7};
        List<Integer> ia = Arrays.stream(a).boxed().toList();
        List<Integer> ib = Arrays.stream(b).boxed().toList();
        List<Integer> commonList = ia.stream().filter(ib::contains).distinct().toList();
        System.out.println(commonList);
    }

}

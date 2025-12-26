package com.crud.test.interview.number_interview;

import java.util.ArrayList;
import java.util.List;

public class MovedZeroInLast {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,34,0,11,0,22,4);
        List<Integer> l1 = new ArrayList<>(list.stream().filter(i -> i != 0).toList());
        List<Integer> l2 = list.stream().filter(i->i==0).toList();
        l1.addAll(l2);
        System.out.println(l1);


    }
}

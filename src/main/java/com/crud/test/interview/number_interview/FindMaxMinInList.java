package com.crud.test.interview.number_interview;

import java.util.Comparator;
import java.util.List;

public class FindMaxMinInList {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8);
        int max = integerList.stream().max(Comparator.naturalOrder()).get();
        int min = integerList.stream().min(Comparator.comparingInt(i -> i)).get();

        System.out.println(max+" > "+min);
    }
}

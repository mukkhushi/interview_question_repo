package com.crud.test.interview.number_interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
        int[] a = {3, 3, 4, 5, 6, 6, 7};
        Set<Integer> set = new HashSet<>();
        int[] duplicates = Arrays.stream(a)
                .filter(i -> !set.add(i))
                .toArray();
        for (int i : duplicates) {
            System.out.println(i);
        }
    }
}

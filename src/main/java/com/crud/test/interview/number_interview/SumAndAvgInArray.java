package com.crud.test.interview.number_interview;

import java.util.Arrays;

public class SumAndAvgInArray {
    public static void main(String[] args) {
        int[]a = {3,4,5,6,7};
        System.out.println(Arrays.stream(a).sum());
        System.out.println(Arrays.stream(a).average().getAsDouble());
    }

}

package com.crud.test.interview.number_interview;

public class BubbleArraySort {

    public static void main(String[] args) {
        //int [] a = {0,1,1,0,0,1,0};
        int[]a = {5,3,4,7,8,2,1};
        for(int i = 0; i < a.length ; i++){
            for(int j = 0; j < (a.length-1)-i; j++) {
                if (a[j] > a[j+1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = (a[j] - a[j + 1]);
                    a[j] = (a[j] - a[j + 1]);
                }
            }
        }
        for (int i:a)
            System.out.print(i+",");

        /*List<Integer> ia = IntStream.of(a).boxed().toList();
        long startTime = System.currentTimeMillis();
        List<Integer> sortedList = ia.stream().sorted().toList();
        long endTime = System.currentTimeMillis();

        System.out.println(endTime-startTime);

        System.out.println(sortedList);*/
    }
}

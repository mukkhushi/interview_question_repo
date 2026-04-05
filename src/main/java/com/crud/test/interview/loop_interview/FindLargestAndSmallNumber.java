package com.crud.test.interview.loop_interview;

public class FindLargestAndSmallNumber {
    public static void main(String[] args) {
        int[] a ={7,3,5,1,40,6};
        int min = a[0];
        int max = a[0];
        for(int num:a){
            if(num < min)
                min = num;
            if(num > max)
                max = num;
        }
        System.out.println("Min : "+min+" Max : "+max);
    }
}

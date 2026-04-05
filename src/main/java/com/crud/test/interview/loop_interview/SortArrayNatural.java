package com.crud.test.interview.loop_interview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArrayNatural {
    public static void main(String[] args) {
        //Bubble Sort
        /*int [] a = {12,10,4,5,16,7,8};
        for(int i=0;i<a.length;i++){
            for(int j =0;j< a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }*/
        int [] a = {12,10,4,5,16,7,8};
        for(int i=0;i<a.length;i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int k:a) System.out.print(k+",");
    }
}

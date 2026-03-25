package com.crud.test.interview.number_interview;


public class MergeSort {

    public static void main(String[] args) {
        int[]arr = {5,6,4,67,3,7};
        int left = 0,right = arr.length-1;
        int[]sarr = new int[arr.length];
        mysort(sarr,left,right);
    }

    private static void mysort(int[]k,int left,int right) {

        int i=0,j=0;


        int m = left+right/2;
        int L[] = new int[m];
        int N[] = new int[right];
        if(m<right){
            mysort(k,left,m);
            mysort(k,m+1,right);
        }
    }

}

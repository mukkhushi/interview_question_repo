package com.crud.test.interview.number_interview;

public class BinaryNumberSort {
    public static void main(String[] args) {
        int a[] = {1,0,1,0,0,1};
        int count =0;
        for(int i:a){
            if(i==1) count++;
        }
        for(int j = 0; j<count; j++){
            a[j] = 0;
        }
        for(int j = count; j<a.length; j++){
            a[j] = 1;
        }
        for(int k:a){
            System.out.print(k+",");
        }
    }
}

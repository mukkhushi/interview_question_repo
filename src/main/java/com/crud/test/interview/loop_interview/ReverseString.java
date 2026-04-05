package com.crud.test.interview.loop_interview;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Mukesh";
        char[] arr = str.toCharArray();
        int i = 0,j = arr.length-1;
        char temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(arr);
    }
}

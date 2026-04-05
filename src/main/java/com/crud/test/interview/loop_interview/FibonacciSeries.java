package com.crud.test.interview.loop_interview;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a= 0, b =1, n=10;
        for(int i=1; i<10; i++){
            System.out.print(a+",");
            int c = a + b;
            a = b;
            b = c;
        }

    }
}

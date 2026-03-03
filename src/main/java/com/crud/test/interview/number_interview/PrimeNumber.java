package com.crud.test.interview.number_interview;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        IntStream.range(1,N)
                .filter(num->
                        num > 1 && IntStream.range(2,num)
                                .noneMatch(i->num % i == 0)
                ).forEach(p-> System.out.print(p+" "));
    }
}

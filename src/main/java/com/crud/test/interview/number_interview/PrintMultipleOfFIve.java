package com.crud.test.interview.number_interview;

import java.util.Scanner;
import java.util.stream.Stream;

public class PrintMultipleOfFIve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Stream.iterate(n,i->i + n)
                .limit(10)
                .forEach(System.out::println);
    }
}

package com.crud.test.interview.number_interview;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CountRepeat1BetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int count = 0;
        for(int i=1;i<=N;i++){
            int num = i,r;
            while(num!=0){
                r=num%10;
                num=num/10;
                if(r==1) count++;
            }
        }
        System.out.println(count);

        Long count2 = IntStream.rangeClosed(1,N)
                .mapToObj(String::valueOf)
                .flatMapToInt(s->s.chars())
                        .filter(ch->ch=='1')
                        .count();
         System.out.println(count2);
    }
}

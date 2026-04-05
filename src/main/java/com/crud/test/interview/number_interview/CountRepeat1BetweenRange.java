package com.crud.test.interview.number_interview;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountRepeat1BetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        /*String j = IntStream.rangeClosed(1,20)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
                //String j = "123121";
     Long count = Stream.of(j.split("")).filter(i->i.contains("1")).count();
     System.out.print(count);
                */
       /* int count = 0;
        for(int i=1;i<=N;i++){
            int num = i,r;
            while(num!=0){
                r=num%10;
                num=num/10;
                if(r==1) count++;
            }
        }
        System.out.println(count);*/

        Long count2 = IntStream.rangeClosed(1,N)
                .mapToObj(String::valueOf)
                .flatMapToInt(String::chars)
                        .filter(ch->ch=='1')
                        .count();
         System.out.println(count2);


        /*Long sum = IntStream.rangeClosed(0,21)
                .mapToObj(Integer::toString)
                .filter(s->s.contains("1"))
                .map(i->
                        Stream.of(i.split(""))
                                .filter(s->s.equals("1"))
                                .count()
                )
                .toList()
                .stream()
                .reduce((a,b)->a+b).orElse(0L);*/
    }
}

package com.crud.test.interview.string_interview;

import java.util.List;
import java.util.stream.IntStream;

public class FindAverageOfWindow {
    public static void main(String[] args) {
       var input = List.of(2,5,3,4,6,9);
       var window = 3;
        //output 3.3,4,4.1,6.1

        List<Double> list = IntStream.range(0, input.size() - (window-1))
                .mapToObj(i-> input.subList(i, window + i))
                .map(
                        m->m
                                .stream()
                                .mapToInt(i->i)
                                .average().orElse(0.0)
                )
                .toList();

        //String s= "mukesh";
        //List<String> stringList = Arrays.stream(s.split("")).toList();

       /*IntStream.range(0, stringList.size() - (window-1))
                .mapToObj(i-> stringList.subList(i, window + i))
                .map(
                        m->m.stream().map(
                                p->p.chars().mapToObj(ch->"aeiou".indexOf(ch)!=-1).count()
                                )

                )
                .forEach(f->System.out.println(f.toList()));*/



        System.out.println(list);

    }
}

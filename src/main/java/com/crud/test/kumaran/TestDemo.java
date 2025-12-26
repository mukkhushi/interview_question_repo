package com.crud.test.kumaran;

import java.util.List;
import java.util.stream.IntStream;

public class TestDemo {
    public static void main(String[] args) {
        //Input: nums = [-1,0,1,2,-1,-4]
        //Output: [[-1,-1,2],[-1,0,1]]

        List<Integer> list = List.of(-1, 0, 1, 2, -1, -4);
        int window = 3;
       List<Integer> filterList = IntStream.range(0,list.size()-(window-1))
                .mapToObj(i-> list.stream())
                .map(j-> j.reduce((a,b)->a+b))
               //.peek(System.out::println)
                .filter(p->p.get()==0)
               .mapToInt(k-> k.get())
               .boxed().toList();
        System.out.println(filterList);

        IntStream.range(0,list.size()-(window-1))
                .mapToObj(i-> list.subList(i ,window + i))
                .map(j->j.stream().mapToInt(s->s).sum()==0

                        ).forEach(System.out::println);

    }
}

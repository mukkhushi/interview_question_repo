package com.crud.test.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mutest {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10)
                .filter(n->n>1 && IntStream.range(2,n).noneMatch(i->n%i==0))
                .forEach(p->System.out.print(p+","));
    }
}

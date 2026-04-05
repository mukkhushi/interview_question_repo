package com.crud.test.interview.loop_interview;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int []a= {2,3,2,5,6,7,6,8};
        Set<Integer> set =new HashSet<>();
        for(int j:a){
            if(!set.add(j)){
                System.out.print(j+",");
            }
        }
    }
}

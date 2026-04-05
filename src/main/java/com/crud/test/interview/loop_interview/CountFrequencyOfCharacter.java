package com.crud.test.interview.loop_interview;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "mukeshkumar";

        char[]arr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(char c:arr){
            map.put(c,map.getOrDefault(c,0)+1);
            //map.computeIfAbsent(c,p->0);
            //map.computeIfPresent(c,(k,v)->v+1);
        }

        System.out.println(map);
    }
}

package com.crud.test.interview.string_interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalVisitCount {
    public static void main(String[] args) {
        Map<String,Integer> visits = new HashMap<>();

        List<String> names = List.of("Alice","Mukesh","Alice","Mukesh","Ravi","Alice","Som");
        for(String s:names) {
            if (!visits.containsKey(s))
                visits.put(s, 1);
            else {
                visits.put(s, visits.get(s) + 1);
            }
            //visits.computeIfAbsent(s,key->0);
            //visits.computeIfPresent(s,(key,count)->count+1);
        }
        System.out.println(visits);
    }
}

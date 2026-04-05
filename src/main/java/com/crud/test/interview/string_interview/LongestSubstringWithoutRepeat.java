package com.crud.test.interview.string_interview;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String s = "pwwkew";
        Map<Character,Integer> map = new HashMap<>();
        int maxLength = 0,left  = 0, start = 0;
        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left  = Math.max(left, map.get(ch)+1);
            }
            map.put(s.charAt(right),right);

            if(right - left +1 > maxLength){
                maxLength = right - left +1 ;
                start  = left ;
            }
        }
        System.out.println(s.substring(start, start + maxLength));
    }
}

package com.crud.test.interview.loop_interview;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringReturn {
    public static String findLongestSubstring(String str){
        int left =0, max =0, start =0;
        Map<Character,Integer> map = new HashMap<>();

        for(int right =0; right < str.length(); right++){
            char ch = str.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch)+1);
            }
            map.put(ch, right);

            if(right - left + 1 > max){
                max = right - left + 1;
                start = left;
            }
        }
        return str.substring(start, start + max);
    }
    public static void main(String[] args) {
        System.out.println(findLongestSubstring("mukkeksph"));
    }
}

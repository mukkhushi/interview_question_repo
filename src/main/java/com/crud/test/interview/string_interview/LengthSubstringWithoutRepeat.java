package com.crud.test.interview.string_interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthSubstringWithoutRepeat {
    //i/p String s = "abcabcbb" o/p 3 (length of abc)

    public static int findLengthOfSubstring(String s){
        /*Set<Character> set  = new HashSet<>();
        int left = 0,right, maxLength=0;
        for( right=0; right<s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(right));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength,right - left +1);
        }
        return maxLength;*/

        Map<Character,Integer> map = new HashMap<>();
        int maxLength = 0,left = 0;
        for( int right=0; right<s.length(); right++){

            if(map.containsKey(s.charAt(right))){
                left = Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            maxLength = Math.max(maxLength,right - left +1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println("Max :Length of Substring is ="+findLengthOfSubstring("abcabcbb"));
    }
}

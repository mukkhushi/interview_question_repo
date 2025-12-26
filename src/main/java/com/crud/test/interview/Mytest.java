package com.crud.test.interview;

public class Mytest {
    public static int findMaxNumberOfSubstring(String s,int window){
        int max = 0, count = 0;
        for(int i = 0;i<s.length()-(window-1);i++){
            if(isVowel(s.charAt(i)))
                count++;
            if(i>=window && isVowel(s.charAt(i-window)))
                count--;
            if(i>=window-1)
                max = Math.max(max,count);
        }
        return max;
    }
    private static boolean isVowel(char c){
        if("aeiouAEIOU".indexOf(c)!=-1)
            return true;
        return false;
    }
    public static void main(String[] args) {
    String s = "mukesh";
    System.out.println(findMaxNumberOfSubstring(s,3));
    }

}

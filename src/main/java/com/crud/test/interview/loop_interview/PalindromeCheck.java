package com.crud.test.interview.loop_interview;

public class PalindromeCheck {
   public static Boolean isPalindrome(String str){
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i] != arr[j])
                return false;
            i++;
            j--;
        }
        return true;
   }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str)?"p":"N");
    }
}

package com.crud.test.interview.string_interview;

public class ReverseStringByRecursion {

    public String revString(String str) {
        if(str.isEmpty()) {return "";} else {
            return revString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(new ReverseStringByRecursion().revString("Mukesh"));
    }
}

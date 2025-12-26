package com.crud.test.interview.string_interview;

import java.util.Arrays;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "mukesh kumar";
        long vowel = Arrays.stream(str.replace("\\s","").toLowerCase()
                        .split(""))

                .distinct()
                .filter("aeiou"::contains)
                .count();
        long cons = Arrays.stream(str.replace(" ","").toLowerCase()
                        .split(""))
                        .distinct()
                .filter(c->!"aeiou".contains(c))
                        .count();
        System.out.println("vowel="+vowel+" AND cons="+cons);
    }
}

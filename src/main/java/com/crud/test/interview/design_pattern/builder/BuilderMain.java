package com.crud.test.interview.design_pattern.builder;

public class BuilderMain {
    public static void main(String[] args) {
       User user = new User.Builder()
                .setId(1)
               .setName("Mukesh")
               .build();

        User user2 = new User.Builder()
                .setId(2)
                .setName("Ramesh")
                .build();

        System.out.println(user);
        System.out.println(user2);
    }
}

package com.crud.test.interview.design_pattern.builder;

public class User {
    private final Integer id;
    private final  String name;
    private final Boolean isIlliterate;

    User(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.isIlliterate = builder.isIlliterate;
    }

    public static class Builder{
        private Integer id;
        private String name;
        private Boolean isIlliterate;

         Builder setId(Integer id){
            this.id = id;
            return this;
        }
        Builder setName(String name){
            this.name = name;
            return this;
        }
        Builder setIsIlliterate(Boolean isIlliterate){
            this.isIlliterate = isIlliterate;
            return this;
        }

        User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isIlliterate=" + isIlliterate +
                '}';
    }
}

package com.crud.test.interview.design_pattern.builder;

public class User {
    private Integer id;
    private String name;
    private Boolean isIlliterate;

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
            User user = new User();
            user.id = this.id;
            user.name = this.name;
            user.isIlliterate = this.isIlliterate;
            return user;
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

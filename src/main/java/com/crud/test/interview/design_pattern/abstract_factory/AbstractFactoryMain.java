package com.crud.test.interview.design_pattern.abstract_factory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        //Trainee Doctor and Teacher
        new AbstractFactoryProducer().isTraineeProfessionType(true).getProfessionType("traineedoctor").printProfession();
        new AbstractFactoryProducer().isTraineeProfessionType(true).getProfessionType("traineeTeacher").printProfession();

        // Doctor and Teacher
        new AbstractFactoryProducer().isTraineeProfessionType(false).getProfessionType("doctor").printProfession();
        new AbstractFactoryProducer().isTraineeProfessionType(false).getProfessionType("Teacher").printProfession();
    }
}

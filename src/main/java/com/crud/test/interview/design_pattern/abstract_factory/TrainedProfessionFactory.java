package com.crud.test.interview.design_pattern.abstract_factory;

public class TrainedProfessionFactory extends AbstractFactoryProfession {

    Profession profession = null;
    @Override
    public Profession getProfessionType(String type) {
        if(type.equalsIgnoreCase("Doctor"))
        {
            profession = new Doctor();
        }
        if(type.equalsIgnoreCase("Teacher"))
        {
            profession = new Teacher();
        }
        return profession;
    }
}

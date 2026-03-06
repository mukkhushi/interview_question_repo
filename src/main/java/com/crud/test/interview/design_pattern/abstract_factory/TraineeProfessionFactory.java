package com.crud.test.interview.design_pattern.abstract_factory;

public class TraineeProfessionFactory extends AbstractFactoryProfession {

    Profession profession = null;
    @Override
    public Profession getProfessionType(String type) {
        if(type.equalsIgnoreCase("traineeDoctor"))
        {
           profession = new TraineeDoctor();
        }
        if(type.equalsIgnoreCase("traineeTeacher"))
        {
            profession = new TraineeTeacher();
        }
        return profession;
    }
}

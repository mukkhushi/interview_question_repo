package com.crud.test.interview.design_pattern.factory;

import com.crud.test.interview.design_pattern.abstract_factory.TraineeDoctor;

public class ProfessionFactory {
    Profession profession = null;
    Profession getProfessionType(String type){

        if(type.equalsIgnoreCase("doctor")){
            profession = new Doctor();
        }
        else if(type.equalsIgnoreCase("teacher")){
            profession = new Teacher();
        }
        return profession;
    }
}

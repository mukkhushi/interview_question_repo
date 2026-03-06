package com.crud.test.interview.design_pattern.factory;

import com.crud.test.interview.design_pattern.abstract_factory.TraineeDoctor;

public class Doctor implements Profession {

    @Override
    public void printProfession() {
        System.out.println("Doctor");
    }
}

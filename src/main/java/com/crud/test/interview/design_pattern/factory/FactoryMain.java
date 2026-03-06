package com.crud.test.interview.design_pattern.factory;

import com.crud.test.interview.design_pattern.abstract_factory.TraineeDoctor;

public class FactoryMain {
    public static void main(String[] args) {
        Profession pf = new ProfessionFactory().getProfessionType("doctaor");
        Profession pf2 = new ProfessionFactory().getProfessionType("teacher");
        if(pf != null)
            pf.printProfession();
        System.out.println(pf);
        if(pf2 != null)
            pf2.printProfession();
        System.out.println(pf2);
    }
}

package com.crud.test.interview.design_pattern.prototype;

import java.util.Hashtable;

public class ProfessionCache {

    private static Hashtable<Integer,Profession> professionMap = new Hashtable<>();

    public static Profession getProfessionClone(Integer id){

        System.out.println(professionMap);
        Profession profession = professionMap.get(id);
        return (Profession) profession.clone();
    }

    public static void loadProfessionCache(){
        Doctor doctor = new Doctor();
        doctor.id = 1;
        doctor.name = "doctor";
        professionMap.put(doctor.id,doctor);

        Teacher teacher = new Teacher();
        teacher.id = 2;
        teacher.name = "teacher";
        professionMap.put(teacher.id,teacher);
    }
}

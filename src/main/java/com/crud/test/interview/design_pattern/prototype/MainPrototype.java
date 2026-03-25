package com.crud.test.interview.design_pattern.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();
        Profession doctorProfession = (Profession)ProfessionCache.getProfessionClone(1);
        Profession teacherProfession = (Profession)ProfessionCache.getProfessionClone(2);
        Profession teacherProfession2 = (Profession)ProfessionCache.getProfessionClone(1);

        System.out.println(doctorProfession);
        System.out.println(teacherProfession);
        System.out.println(teacherProfession2);

    }
}

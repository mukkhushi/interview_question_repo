package com.crud.test.interview.number_interview;

import com.crud.test.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        for(int i=0;i<5000;i++){
            Employee emp = new Employee();
            employeeList.add(emp);
        }
        /*
        long start;
        long end;
        start = System.currentTimeMillis();
        Double avgSalaryFindByStream;
        end = System.currentTimeMillis();
        System.out.println("end-start");
        start = System.currentTimeMillis();
        Double avgSalaryFindByParallelStream;
        end = System.currentTimeMillis();
        System.out.println("end-start");
        */


    }
}

package com.crud.test.interview.number_interview;

import java.util.List;


public class Find2ndMaximumSalary {
    public static void main(String[] args) {
        EmployeeDTOSalary employee1 =
                new EmployeeDTOSalary(1,"Mukesh","IT",35000.0);
        EmployeeDTOSalary employee2 =
                new EmployeeDTOSalary(2,"Sandeep ","HR",45000.0);
        EmployeeDTOSalary employee3 =
                new EmployeeDTOSalary(3,"Ramesh","Sale",25000.0);
        EmployeeDTOSalary employee4 =
                new EmployeeDTOSalary(4,"Brijesh","Market IT",65000.0);
        EmployeeDTOSalary employee5 =
                new EmployeeDTOSalary(5,"Somesh","Digital IT",55000.0);
        List<EmployeeDTOSalary> employeeList = List.of(employee1,employee2,employee3,employee4,employee5);

        //find 2nd maximum salary
        Double secondMaxSal = employeeList.stream()
                .sorted((e1,e2)->e2.getSalary().compareTo(e1.getSalary()))
                .skip(1).findFirst().get().getSalary();

        System.out.println(secondMaxSal);
    }
}
//for testing
class EmployeeDTOSalary{
    private Integer id;
    private String name;
    private String deptName;
    private Double salary;

    public EmployeeDTOSalary(Integer id, String name, String deptName, Double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

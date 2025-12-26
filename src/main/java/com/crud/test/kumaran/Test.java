package com.crud.test.kumaran;

import java.util.*;

class Employee{
    private Integer id;
    private String name;
    private Integer num;
    Employee(Integer id,String name,Integer num){
        this.id= id;
        this.name = name;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString(){
        return id+ " "+name+" "+num;
    }

}
public class Test {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();

        Employee emp1 = new Employee(1,"abc1",121);
        Employee emp2 = new Employee(2,"abc2",122);
        Employee emp3 = new Employee(3,"abc3",123);
        Employee emp4 = new Employee(4,"abc4",124);
        Employee emp5 = new Employee(1,"abc1",121);

        Comparator<Employee> nameComparator = (e1,e2)-> e1.getName().compareTo(e2.getName());



        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        set.add(emp4);
        set.add(emp5);

        //List<Employee> employeeList = new ArrayList<>(set);
        List<Employee> employeeList = set.stream().toList();
        //employeeList.add(emp1);

        //Collections.sort(employeeList,nameComparator);
        employeeList.sort(nameComparator);

        //System.out.println(employeeList);

       employeeList.forEach(System.out::println);
    }
}

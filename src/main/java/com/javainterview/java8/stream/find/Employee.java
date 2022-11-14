package com.javainterview.java8.stream.find;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {

    public int id;
    public String name;
    public int sal;

    public static List<Employee> getEmpList() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "A", 2000));
        empList.add(new Employee(2, "B", 3000));
        empList.add(new Employee(3, "C", 4000));
        empList.add(new Employee(4, "D", 5000));
        return empList;
    }
}

package com.javainterview.common;

public class Employee {
    private Integer id;
    private String name;
    private String Dept;
    private Integer salary;

    public Employee(Integer id, String name, String dept, Integer salary) {
        this.id = id;
        this.name = name;
        Dept = dept;
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

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Dept='" + Dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}

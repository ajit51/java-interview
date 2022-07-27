package com.javainterview.sort;

import java.util.Comparator;

public class IdCompator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpId() - o2.getEmpId();
    }
}

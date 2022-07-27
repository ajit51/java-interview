package com.javainterview.java8.predicate;

import com.javainterview.java8.supplier.Student;

import java.util.function.Predicate;

public class Predicate2 {
    public static void main(String[] args) {
        // Adding data of Student
        Student studentOne =  new Student(1, "MCA", "Ram");
        Student studentTwo =  new Student(2, "MSC", "Sham");

        Predicate<Student> predicate = (stud) -> (stud.getRollNo() == 2);

        System.out.println(predicate.test(studentOne));
        System.out.println(predicate.test(studentTwo));
    }
}

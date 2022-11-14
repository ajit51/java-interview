package com.javainterview.junittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LibraryTestForTestPrivateMethod {


    //There are two ways to write junit test cases for private method
    //1. calling the private method from public method and write Junit for public method to cover private method
    //use cases as well
    //2. using Reflection
    @Test
    public void testSumOfNumbers(){
        Library library = new Library();
        int sum = library.sumOfNumbers(2, 4);
        Assertions.assertEquals(6, sum);
    }

    @Test
    public void testSumOfTwoNumbers() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Library.class.getDeclaredMethod("sumOfTwoNumbers", Integer.class, Integer.class);
        method.setAccessible(true);
        Library library = new Library();
        int sum = (int) method.invoke(library, 10, 30);
        Assertions.assertEquals(40, sum);
    }
}

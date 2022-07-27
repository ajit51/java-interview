package com.javainterview.exception;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String str){
        // calling the constructor of parent Exception
        super(str);
    }
}
class TestCustomException1 {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18){
            throw new InvalidAgeException("age is not valid to vote");
        }else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured: "+e  );
        }
        System.out.println("rest of the code...");
    }
}


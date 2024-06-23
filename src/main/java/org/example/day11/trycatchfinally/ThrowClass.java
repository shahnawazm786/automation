package org.example.day11.trycatchfinally;

public class ThrowClass {
    void ageValidation(int age){
        if (age<18)
            throw new ArithmeticException("Age excception");
    }
}

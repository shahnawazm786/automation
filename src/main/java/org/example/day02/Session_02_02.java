package org.example.day02;

public class Session_02_02 {
    public static void main(String[] args) {
        // Logical operator
        // AND (&)  OR (|)
        // NOT (!)
        // {q1 => true q2 => true q3 => true q4 => true } => true
        System.out.println(100>50 & 200 >100 & 300 >200 & 400 >300);
        // 100 > 50 - true
        // 200 > 100 - true
        // 300 > 200 - true
        // 400 > 300  true
        // result {ture & true & true & true } => true
        System.out.println(100>50 & 200 >100 & 300 >200 & 400 <300);
        // 100 > 50 - true
        // 200 > 100 - true
        // 300 > 200 - true
        // 400 > 300  false
        // result {ture & true & true & false } => false

        System.out.println(100<50 & 200 <100 & 300 <200 & 400 <300);
        // 100 > 50 - false
        // 200 > 100 - false
        // 300 > 200 - false
        // 400 > 300  false
        // result {false & false & false & false } => false
    }
}

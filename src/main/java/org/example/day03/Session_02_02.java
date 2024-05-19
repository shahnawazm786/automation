package org.example.day03;

import java.util.Scanner;

public class Session_02_02 {
    public static void main(String[] args) {
        double salary;
        double tax;
        double net_sal;

        // salary >50000 - 10%
        // salary >45000 <50000 - 8%
        // salary >35000 <45000 - 6%
        // >25000 <350000 - 4%
        // <25000 - no tax
        // if -  else if - else

        System.out.println("Enter your salary for tax calculation");
            Scanner scanner = new Scanner(System.in);
            salary = scanner.nextDouble();
            System.out.println("Your salary is \t" + salary);
            /*Tax calculator*/
            if (salary >= 50000) {

                tax = (salary * 10) / 100;
                System.out.println("Your tax to be paid \t" + tax);
                net_sal = salary - tax;
                System.out.println("Your Net Salary is \t" + net_sal);
            } else if (salary >= 45000 & salary < 50000) {

                tax = (salary * 8) / 100;
                System.out.println("Your tax to be paid \t" + tax);
                net_sal = salary - tax;
                System.out.println("Your Net Salary is \t" + net_sal);
            } else if (salary >= 35000 & salary < 45000) {

                tax = (salary * 6) / 100;
                System.out.println("Your tax to be paid \t" + tax);
                net_sal = salary - tax;
                System.out.println("Your Net Salary is \t" + net_sal);
            } else if (salary >= 25000 & salary < 35000) {

                tax = (salary * 4) / 100;
                System.out.println("Your tax to be paid \t" + tax);
                net_sal = salary - tax;
                System.out.println("Your Net Salary is \t" + net_sal);
            } else {
                tax = 0;
                System.out.println("Your tax to be paid \t" + tax);
                net_sal = salary - tax;
                System.out.println("Your Net Salary is \t" + net_sal);

            }

    }
}




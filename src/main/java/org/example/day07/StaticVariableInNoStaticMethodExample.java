package org.example.day07;

public class StaticVariableInNoStaticMethodExample {
    static double tax=16.99;
    static void calculateTeacherSalary(){
        System.out.println("Teacher Salary");
        System.out.println(tax);
    }
    void calculateDoctorSalary(){
        System.out.println("Doctor Salary");
        System.out.println(tax);
    }
    void calculateEngineerSalary(){
        System.out.println("Engineer Salary");
        System.out.println(tax);
    }

    public static void main(String[] args) {
        calculateTeacherSalary();

        StaticVariableInNoStaticMethodExample obj=new StaticVariableInNoStaticMethodExample();
        obj.calculateDoctorSalary();
        //obj.calculateEngineerSalary();
    }
}

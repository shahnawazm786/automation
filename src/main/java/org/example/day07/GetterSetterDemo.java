package org.example.day07;

public class GetterSetterDemo {
    public static void main(String[] args) {
        GetterSetterExample getterSetterExample=new GetterSetterExample();
        System.out.println("Setting the value");
        getterSetterExample.seteId(1001);
        getterSetterExample.setEmpName("KAZ");
        getterSetterExample.setEmpSalary(50000);
        System.out.println("Employee id\t"+getterSetterExample.geteId());
        System.out.println("Employee id\t"+getterSetterExample.getEmpName());
        System.out.println("Employee id\t"+getterSetterExample.getEmpSalary());
        System.out.println("Employee id\t"+getterSetterExample.netSalary());
    }
}

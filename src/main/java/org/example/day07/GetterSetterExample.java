package org.example.day07;

public class GetterSetterExample {
    private int eId;
    private String empName;
    private double empSalary;
    private double empNetSalary;
    private final double tax=14.5;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

   /* public double getEmpNetSalary() {
        return empNetSalary;
    }

    public void setEmpNetSalary(double empNetSalary) {
        this.empNetSalary = empNetSalary;
    }*/

    public double netSalary(){
        return getEmpSalary()-(getEmpSalary()*tax)/100;
    }

}

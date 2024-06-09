package org.example.day07;

public class PrivateVariableAccessibleExample {
    private int roll=100;
    String name="KAZ";// default / package
    protected String gender="Male";
    public String grade="First";
    public static void main(String[] args) {
        PrivateVariableAccessibleExample obj=new PrivateVariableAccessibleExample();

        System.out.println(obj.roll);
        System.out.println(obj.name);
        System.out.println(obj.gender);
        System.out.println(obj.grade);

    }
}

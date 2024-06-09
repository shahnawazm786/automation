package org.example.day07;

public class PrivateDemo {
    public static void main(String[] args) {
        PrivateVariableAccessibleExample obj=new PrivateVariableAccessibleExample();
        //System.out.println(obj.roll);// error because it is declared private
        System.out.println(obj.name);// within the same package default is accessible
        System.out.println(obj.gender);
        System.out.println(obj.grade); // it is public
    }
}

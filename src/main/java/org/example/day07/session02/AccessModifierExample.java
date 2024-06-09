package org.example.day07.session02;

import org.example.day07.PrivateVariableAccessibleExample;

public class AccessModifierExample {
    public static void main(String[] args) {
        PrivateVariableAccessibleExample obj=new PrivateVariableAccessibleExample();
        //System.out.println(obj.name); // in the different package default/package variable not accessible
        //System.out.println(obj.roll);// // private can't be accessible here as well
        //System.out.println(obj.gender); it is not accessible because it is in different package
        System.out.println(obj.grade);// because of public

    }


}

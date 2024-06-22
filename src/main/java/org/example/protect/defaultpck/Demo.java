package org.example.protect.defaultpck;

import org.example.protect.ClassOne;
import org.example.protect.ClassTwo;

public class Demo {
    public static void main(String[] args) {
        ClassOne one=new ClassOne();
       // one.show(); //compile time error
        ClassTwo two=new ClassTwo();
        //two.disp();
    }
}

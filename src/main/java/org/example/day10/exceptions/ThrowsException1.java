package org.example.day10.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ThrowsException1 {
    void arithmetic() throws ArithmeticException {
        //try {
            System.out.println(100 / 0);
        //} catch (ArithmeticException ae) {
        //    System.out.println("Exception raised" + ae.getMessage());
       // }
    }
    void readFile() throws FileNotFoundException{
        File file=new File("c:/abc.txt");
        //try {
            FileReader reader = new FileReader(file);
        //}catch (FileNotFoundException fe){
        //    System.out.println("File not found"+fe.getMessage());
       // }
    }
}

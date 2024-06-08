package org.example.day06;

public class StringMethodIsEmptyExample {
    public static void main(String[] args) {
        String str=null;
        if(str==null){
            System.out.println("Null value ");
        }
        str="";
        if(str.isEmpty()){
            System.out.println("str is empty");
        }
        str=" ";
        if(str.isBlank()){
            System.out.println("str is blank");
        }

    }
}

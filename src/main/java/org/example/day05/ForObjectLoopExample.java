package org.example.day05;

import java.util.Arrays;

public class ForObjectLoopExample {
    // for each or for object iteration object
    // x=100
    // school_result -> 100 students
    // 100 variable defined  - logically wrong implementation
    // arrays / collections
    // String - > iteration character

    public static void main(String[] args) {
        String str="codingmaktab";// object
        for(char c : str.toCharArray()){
            System.out.println(c);
        }
        String sentence="This is a program of java. java is a high level language";
        String[] words=sentence.split(" ");
        System.out.println(words);
        System.out.println("Stream API");
        Arrays.stream(words).forEach(x->System.out.println(x));
        System.out.println("For object");
        for(String s:words){
            System.out.println(s);
        }
        System.out.println("For loop legacy");
        for(int i=0; i<words.length;i++){
            System.out.println(words[i]);
        }
    }
}

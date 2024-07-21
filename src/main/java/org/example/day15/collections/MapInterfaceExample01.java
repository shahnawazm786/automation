package org.example.day15.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample01 {
    public static void main(String[] args) {
     String sentence="This is java class we are giving free online class of automation please join java class";
     String[] words=sentence.split(" ");
        Map<String,Integer> countWord=new HashMap<>();
        System.out.println(words);
        System.out.println(words[0]);
        int count=0;
        for(String w:words){
            if(countWord.containsKey(w)){
                count=countWord.get(w);
                count++;
                countWord.put(w,count);
            }
            else {
                countWord.put(w,1);
            }
        }

        System.out.println(countWord);
    }
}

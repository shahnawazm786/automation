package org.example.day06;

public class WordCountInterviewExample {
    public static void main(String[] args) {
        String sentence="Java";
        int countWord=0;
        if(sentence==null){
            System.out.println("No of words into the sentence is "+countWord);
        }
        else {
            countWord=1;
            for(int i=0; i<sentence.length(); i++){
                if(sentence.charAt(i)==' '){
                    countWord++;
                }
            }
            System.out.println("No of words into the sentence is "+countWord);
        }
    }
}

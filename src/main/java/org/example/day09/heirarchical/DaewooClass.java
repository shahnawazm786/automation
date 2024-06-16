package org.example.day09.heirarchical;

public class DaewooClass extends ViechlesClass{
    void Break(){
        System.out.println("Marutri is slow now "+(currentSpeed - 40));
    }
    void Excelrator(){
        System.out.println("Marutri is slow now "+(currentSpeed + 40));
    }
}

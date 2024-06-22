package org.example.day09.heirarchical;

public class MarutiClass extends ViechlesClass{
    public void Break(){
        currentSpeed=currentSpeed-20;
        System.out.println("Marutri is slow now "+currentSpeed);
    }
    public void Excelrator(){
        currentSpeed=currentSpeed+20;
        System.out.println("Marutri is slow now "+(currentSpeed));
    }
}

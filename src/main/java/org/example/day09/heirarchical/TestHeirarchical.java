package org.example.day09.heirarchical;

public class TestHeirarchical {
    public static void main(String[] args) {
        ViechlesClass v=new ViechlesClass();
        System.out.println(v.currentSpeed);
        System.out.println(v.speed(10));
        System.out.println("Maruti current speed");
        MarutiClass m1=new MarutiClass();
        System.out.println(m1.currentSpeed);
        System.out.println(m1.speed(60));
        System.out.println(m1.currentSpeed);
        m1.Break();
        m1.Excelrator();
        DaewooClass d1=new DaewooClass();

    }
}

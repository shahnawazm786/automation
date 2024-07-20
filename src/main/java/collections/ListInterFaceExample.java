package collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterFaceExample {
    public static void main(String[] args) {
        List<Integer> marks= new ArrayList<Integer>();
        marks.add(100);
        marks.add(200);
        marks.add(300);
        marks.add(400);
        System.out.println(marks);
        System.out.println("Add value into after 100");
        marks.add(1,150);
        System.out.println(marks);
        System.out.println("Remove 200 from the list");
        marks.remove(new Integer(200));// by object
        System.out.println(marks);
        System.out.println("Removing 300 by index");
        marks.remove(2);
        System.out.println(marks);
        marks.get(0);// return the value of 0 index

    }
}

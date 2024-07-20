package collections.sets;
import java.util.*;
public class SetInterfaceExample {
    public static void main(String[] args) {
        Set<Integer> marks=new HashSet<>();
        marks.add(100);
        marks.add(400);
        marks.add(900);
        marks.add(1000);
        System.out.println(marks);
        boolean flag = marks.contains(100);
        marks.add(400);
        System.out.println(marks);
        marks.forEach(s-> System.out.println(s));
        marks.add(null);
        System.out.println(marks);
        marks.add(500);
        marks.add(null);
        System.out.println(marks);
    }
}

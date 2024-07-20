package collections;
import java.util.*;
public class ListInterfaceExample01 {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("Oracle");
        name.add("Java");
        name.add("Microsoft");
        name.add("SQL");
        name.add("Php");
        name.forEach(n-> System.out.println(n));
    }
}

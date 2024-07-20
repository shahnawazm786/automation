package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListInterfaceExample02 {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("Oracle");
        name.add("Java");
        name.add("Microsoft");
        name.add("SQL");
        name.add("Php");
        name.add("Oracle");

        // check word found into the list of not
        name.forEach(n->{
            if(n.equalsIgnoreCase("Oracle")){
                System.out.println("Oracle found....");
            }
        });
        long count = name.stream().filter(n->n.equalsIgnoreCase("Oracle")).count();
        System.out.println("Oracle count"+ count);
        Optional<String> findFirst = name.stream().findFirst();
        System.out.println(findFirst.toString());

    }
}

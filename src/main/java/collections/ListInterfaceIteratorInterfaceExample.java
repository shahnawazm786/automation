package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceIteratorInterfaceExample {
    public static void main(String[] args) {
        List<Integer> marks= new ArrayList<Integer>();
        marks.add(100);
        marks.add(200);
        marks.add(300);
        marks.add(400);
        Iterator<Integer> iterator= marks.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

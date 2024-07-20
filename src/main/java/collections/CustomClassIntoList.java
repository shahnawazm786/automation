package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomClassIntoList {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person(1001,"Jhonny","New Delhi"));
        personList.add(new Person(1002,"Kirpa","Mumbai"));
        personList.add(new Person(1004,"Duke","Karnataka"));
        personList.add(new Person(1004,"Kirpa","Mumbai"));
        for(Person p:personList){
            System.out.println(p.getName()+"\t"+p.getAddress()+"\t"+p.getPersonId());
            /*System.out.println(p.getAddress());
            System.out.println(p.getPersonId());*/
        }
        System.out.println("Person data display using for each ");
        personList.forEach(p-> System.out.println(p.getPersonId() +"\t"+p.getName()+"\t"+p.getAddress()));
        System.out.println("Show the person details whose name is Kirpa");
        personList.forEach(p-> {
            if(p.getName().equalsIgnoreCase("Kirpa"))
                System.out.println(p.getPersonId() + "\t" + p.getName() + "\t" + p.getAddress());
        });
        System.out.println("Show the person details whose name is Kirpa");
        Optional<Person> p1=personList.stream().filter(p -> p.getName().equalsIgnoreCase("Kirpa")).findFirst();
        System.out.println(p1.get().getPersonId());
        System.out.println(p1.get().getName());
        System.out.println(p1.get().getAddress());
        Optional<Person> p2=personList.stream().filter(p -> p.getName().equalsIgnoreCase("Kirpa")).findAny();
        System.out.println(p2.get().getPersonId());
        System.out.println(p2.get().getName());
        System.out.println(p2.get().getAddress());
    }
}

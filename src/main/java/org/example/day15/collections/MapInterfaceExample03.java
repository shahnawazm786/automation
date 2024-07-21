package org.example.day15.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class MapInterfaceExample03 {
    public static void main(String[] args) {
        Map<Integer,String> player=new HashMap<>();
        player.put(1001,"Sachin");
        player.put(1002,"Zaheer");
        player.put(1003,"Sami");
        player.put(1004,"Yusuf Pathan");
        player.put(1005,"Irfan Pathan");
        player.put(1006,"Gangooly");
        player.put(1007,"Dhoni");
        player.entrySet().forEach(m->{
            System.out.println(m.getValue());
            System.out.println(m.getKey());
        });
        long count=player.entrySet().stream().count();
        System.out.println(count);
        Optional<Map.Entry<Integer, String>> entry = player.entrySet().stream().filter(m -> m.getValue().equalsIgnoreCase("Zaheer")).findFirst();
        System.out.println(entry.get().getKey());
        System.out.println(entry.get().getValue());
    }
}

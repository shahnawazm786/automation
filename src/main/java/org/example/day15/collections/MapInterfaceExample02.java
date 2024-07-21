package org.example.day15.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample02 {
    public static void main(String[] args) {
        Map<Integer,String> player=new HashMap<>();
        player.put(1001,"Sachin");
        player.put(1002,"Zaheer");
        player.put(1003,"Sami");
        player.put(1004,"Yusuf Pathan");
        player.put(1005,"Irfan Pathan");
        player.put(1006,"Gangooly");
        player.put(1007,"Dhoni");
        for(Map.Entry<Integer,String> m : player.entrySet()){

            if(m.getValue().equalsIgnoreCase("Zaheer")){
                System.out.println("Key \t=>"+m.getKey()+ " \t Value =>"+m.getValue());
            }

        }


    }
}

package org.example.day15.collections;
import org.apache.logging.log4j.core.util.JsonUtils;

import java.util.*;
public class MapInterfaceExamples {

    public static void main(String[] args) {
       Map<Integer,String> player=new HashMap<>();
       player.put(1001,"Sachin");
        player.put(1002,"Zaheer");
        player.put(1003,"Sami");
        player.put(1004,"Yusuf Pathan");
        player.put(1005,"Irfan Pathan");
        player.put(1006,"Gangooly");
        player.put(1007,"Dhoni");
        System.out.println(player);
        System.out.println(player.get(1002));
        player.put(1003,"Mohammad Sami"); // check key is exist, if key exist then it is modified with the new data
        // if key is not exist then it is adding into the map
        System.out.println(player);
        player.remove(1006);
        System.out.println(player);


    }

}

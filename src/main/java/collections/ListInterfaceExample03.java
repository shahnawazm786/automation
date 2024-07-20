package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListInterfaceExample03 {
    public static void main(String[] args) {
        List<Integer> marks= Arrays.asList(8,20,7,40,-1);
        Stream<Integer> sortedList = marks.stream().sorted();
        System.out.println(sortedList);
        System.out.println(sortedList.collect(Collectors.toList()));
        int[] num={10,8,40,29,30};
         Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }



    }
}

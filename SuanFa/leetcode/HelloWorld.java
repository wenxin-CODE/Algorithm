package leetcode;

//import leetcode.easy.Demo5;
//import leetcode.hard.Demo4;
import leetcode.middle.Demo3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        Demo3 dd = new Demo3();
        String[][] arr = {{"David","3","Ceviche"},{"Corina","10","Beef Burrito"},{"David","3","Fried Chicken"},{"Carla","5","Water"},{"Carla","5","Ceviche"},{"Rous","3","Ceviche"}};
        List<String[]> list_array = Arrays.asList(arr);
        List<List<String>> list_integer = new ArrayList<List<String>>();
        for (int i = 0; i < list_array.size(); i++)
        {
            list_integer.add(Arrays.asList(list_array.get(i)));
        }

        for (List<String> innerList : list_integer)
        {
            for (String value : innerList)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println(list_integer);
        System.out.println("你好世界！！！"+dd.displayTable(list_integer));
        //System.out.println("你好世界！！！"+dd.serialize(dd));
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 13; j++) {
//                System.out.print("("+i+","+j+")");
//            }
//            System.out.println();
//        }
    }
}

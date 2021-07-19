package leetcode.middle;

import java.util.*;

//https://leetcode-cn.com/problems/display-table-of-food-orders-in-a-restaurant/
public class Demo3 {
    public List<List<String>> displayTable(List<List<String>> orders) {
        // 从订单中获取餐品名称和桌号，统计每桌点餐数量
        Set<String> nameSet = new HashSet<String>();
        Map<Integer, Map<String, Integer>> foodsCnt = new HashMap<Integer, Map<String, Integer>>();
        for (List<String> order : orders) {
            nameSet.add(order.get(2));
            int id = Integer.parseInt(order.get(1));
            Map<String, Integer> map = foodsCnt.getOrDefault(id, new HashMap<String, Integer>());
            map.put(order.get(2), map.getOrDefault(order.get(2), 0) + 1);
// Map.getOrDefault(Object key, V defaultValue)方法的作用是：
// 当Map集合中有这个key时，就使用这个key值；
// 如果没有就使用默认值defaultValue。
            foodsCnt.put(id, map);
        }

        // 提取餐品名称，并按字母顺序排列
        int n = nameSet.size();
        List<String> names = new ArrayList<String>();
        for (String name : nameSet) {
            names.add(name);
        }
        Collections.sort(names);

        // 提取桌号，并按餐桌桌号升序排列
        int m = foodsCnt.size();
        List<Integer> ids = new ArrayList<Integer>();
        for (int id : foodsCnt.keySet()) {
            ids.add(id);
        }
        Collections.sort(ids);

        // 填写点菜展示表
        List<List<String>> table = new ArrayList<List<String>>();
        List<String> header = new ArrayList<String>();
        header.add("Table");
        for (String name : names) {
            header.add(name);
        }
        table.add(header);
        for (int i = 0; i < m; ++i) {
            int id = ids.get(i);
            Map<String, Integer> cnt = foodsCnt.get(id);
            List<String> row = new ArrayList<String>();
            row.add(Integer.toString(id));
            for (int j = 0; j < n; ++j) {
                row.add(Integer.toString(cnt.getOrDefault(names.get(j), 0)));
            }
            table.add(row);
        }
        return table;
    }
}

//String[][] arr = {{"David","3","Ceviche"},{"Corina","10","Beef Burrito"},{"David","3","Fried Chicken"},{"Carla","5","Water"},{"Carla","5","Ceviche"},{"Rous","3","Ceviche"}};
//        List<String[]> list_array = Arrays.asList(arr);
//        List<List<String>> list_integer = new ArrayList<List<String>>();
//        for (int i = 0; i < list_array.size(); i++)
//        {
//            list_integer.add(Arrays.asList(list_array.get(i)));
//        }
//
//        for (List<String> innerList : list_integer)
//        {
//            for (String value : innerList)
//            {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(list_integer);
//二维数组转二维list
//String[][] arr = {{"David","3","Ceviche"},{"Corina","10","Beef Burrito"},{"David","3","Fried Chicken"},{"Carla","5","Water"},{"Carla","5","Ceviche"},{"Rous","3","Ceviche"}};
//    List<String[]> list_array = Arrays.asList(arr);
//    List<List<String>> list_integer = new ArrayList<List<String>>();
//        for (int i = 0; i < list_array.size(); i++)
//        {
//        list_integer.add(Arrays.asList(list_array.get(i)));
//        }
//
//        for (List<String> innerList : list_integer)
//        {
//        for (String value : innerList)
//        {
//        System.out.print(value + " ");
//        }
//        System.out.println();
//        }
//        System.out.println(list_integer);
//        System.out.println("你好世界！！！"+dd.displayTable(list_integer));
//System.out.println("你好世界！！！"+dd.serialize(dd));
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 13; j++) {
//                System.out.print("("+i+","+j+")");
//            }
//            System.out.println();
//        }
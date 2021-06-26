package leetcode.hard;

import java.util.*;

public class Demo3 {

    int[][] neighbors = {{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
    //定义每一个位置的相邻位置

    public int slidingPuzzle(int[][] board){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(board[i][j]);
            }
        }
        //转换数据类型，适应哈希结构

        String initial = sb.toString();
        if("123450".equals(initial)){
            return 0;
        }

        int step = 0;
        Queue<String> queue = new LinkedList<String>();
        queue.offer(initial);
        Set<String> seen = new HashSet<String>();
        seen.add(initial);
        //入队列+入哈希

        while (!queue.isEmpty()){
            ++step;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String status = queue.poll();
                for (String nextstatus : get(status)){
                    if (!seen.contains(nextstatus)){
                        if ("123450".equals(nextstatus)){
                            return step;
                        }
                        queue.offer(nextstatus);
                        seen.add(nextstatus);
                        //没有就加上
                    }
                }
            }
        }
        return -1;
    }

    //返回调换’0‘相邻位置的结果
    public List<String> get(String status){
        List<String> ret = new ArrayList<>();
        char[] array = status.toCharArray();
        int x = status.indexOf('0');
        for (int y:neighbors[x]){
            swap(array,x,y);
            ret.add(new String(array));
            swap(array,x,y);
        }
        return ret;
    }

    public void swap(char[] array,int x,int y){
        char temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}

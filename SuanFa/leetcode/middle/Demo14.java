package leetcode.middle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//深度优先搜索
//https://leetcode-cn.com/problems/all-paths-from-source-to-target/

public class Demo14 {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    Deque<Integer> stack = new ArrayDeque<Integer>();

    public List<List<Integer>> allPath(int[][] graph){
        stack.offerLast(0);
        dfs(graph,0,graph.length-1);
        return ans;
    }

    public void dfs(int[][] graph,int x,int n){
        if (x==n){
            ans.add(new ArrayList<Integer>(stack));
            return;
        }
        for (int y : graph[x]){
            stack.offerLast(y);
//offerLast(): 向队尾插入元素，如果插入成功返回true，否则返回false
//https://blog.csdn.net/onedegree/article/details/108295374
            dfs(graph,y,n);
            stack.pollLast();
//pollLast(): 返回并移除队尾元素，如果队列无元素，则返回null
        }
    }
}

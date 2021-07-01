package leetcode;

import leetcode.easy.Demo5;
//import leetcode.hard.Demo4;
//import leetcode.middle.Demo2;

public class HelloWorld {
    public static void main(String[] args) {
        Demo5 dd = new Demo5();
        int[][] arr = {{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        int n=5;
        System.out.println("你好世界！！！"+dd.numWays(n,arr,3));
        //System.out.println("你好世界！！！"+dd.serialize(dd));
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 13; j++) {
//                System.out.print("("+i+","+j+")");
//            }
//            System.out.println();
//        }
    }
}

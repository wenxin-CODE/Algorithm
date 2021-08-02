package leetcode;

import leetcode.easy.Demo9;
//import leetcode.hard.Demo4;
import leetcode.middle.Demo8;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        Demo8 dd = new Demo8();
        int[][] nums = {{2,1,1},{2,3,1},{3,4,1}};
        int k=5;
        System.out.println(dd.networkDelayTime(nums,4,2));
    }
}

package leetcode;

import leetcode.easy.Demo9;
//import leetcode.hard.Demo4;
import leetcode.middle.Demo5;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        Demo9 dd = new Demo9();
        int[][] nums = {{1,0,0,0},{1,1,1,0},{1,1,0,0},{0,0,0,0}};
        int k=5;
        System.out.println(dd.kWeakestRows(nums,2));
    }
}

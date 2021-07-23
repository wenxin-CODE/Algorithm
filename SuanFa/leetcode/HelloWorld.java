package leetcode;

import leetcode.easy.Demo6;
//import leetcode.hard.Demo4;
import leetcode.middle.Demo5;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        Demo6 dd = new Demo6();
        int[][] nums = {{1,10},{10,20}};
        int k=5;
        System.out.println(dd.isCovered(nums,21,21));
    }
}

package leetcode;

import leetcode.easy.Demo15;
import leetcode.hard.Demo9;
import leetcode.middle.Demo18;


public class HelloWorld {
    public static void main(String[] args) {
        Demo9 dd = new Demo9();
        int[] nums ={1,2,3};
        int[] capital = {0,1,2};

        System.out.println(dd.findMaximizedCapital(3,0,nums,capital));
//        System.out.println((char) (1 % 10 + '0'));
    }
}

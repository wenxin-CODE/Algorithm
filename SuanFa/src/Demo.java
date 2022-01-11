package src;
import src.middle.Solution2;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] num = new int[5];
        num = new int[]{1, 3, 2, 7, 9};
        boolean ret = s.increasingTriplet(num);
        System.out.println(ret);
        System.out.println("hello world!!!");
    }
}

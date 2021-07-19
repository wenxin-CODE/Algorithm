package leetcode.middle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
//https://leetcode-cn.com/problems/frequency-of-the-most-frequent-element/

public class Demo4 {
    public int maxFrequency(int[] nums,int k){
        Arrays.sort(nums);
        int n = nums.length;
        int l=0,res=1;
        long total = 0;

        for (int r = 1; r < n; r++) {
            total+=(long) (nums[r]-nums[r-1])*(r-l);
            //计算基础增加次数
            while (total>k){
                total-=nums[r]-nums[l];
                ++l;
            }
            //左移至增加次数小于等于指定次数
            res= Math.max(res,r-l+1);
        }
        return res;
    }
}

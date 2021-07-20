package leetcode.middle;

import java.util.Arrays;
//https://leetcode-cn.com/problems/minimize-maximum-pair-sum-in-array/solution/shu-zu-zhong-zui-da-shu-dui-he-de-zui-xi-cvll/

public class Demo5 {
    public int minPairSum(int[] nums){
        int n = nums.length;
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n/2; i++) {
            res = Math.max(res,nums[i] + nums[n-1-i]);
        }
        return res;
    }
}

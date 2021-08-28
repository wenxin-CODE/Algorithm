package leetcode.easy;


//https://leetcode-cn.com/problems/running-sum-of-1d-array/solution/yi-wei-shu-zu-de-dong-tai-he-by-leetcode-flkm/

public class Demo12 {
    public int[] runningSum(int[] nums){
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}

package src.middle;

public class Solution2 {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }
        int[] leftMin = new int[n];
        leftMin[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }
        int[] rightMax = new int[n];
        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > leftMin[i - 1] && nums[i] < rightMax[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

//递增不一定要下标连续
//第三个for循环前面两个for循环是为了说明前面还有比当前这个数小的，后面还有比当前这个数大的
//https://leetcode-cn.com/problems/increasing-triplet-subsequence/
//三连增这么高，那四连、五连呢，应该可以用贪心算法解决


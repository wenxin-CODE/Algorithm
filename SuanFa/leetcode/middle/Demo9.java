package leetcode.middle;

import java.util.Arrays;

public class Demo9 {
    public int findUnsortedSubarray(int[] nums){
        if (isSorted(nums)){
            return 0;
        }
        int[] numsSorted = new int[nums.length];
        System.arraycopy(nums,0,numsSorted,0,nums.length);
//        刷意思
        Arrays.sort(numsSorted);
        int left = 0;
        while (nums[left] == numsSorted[left]){
            left++;
        }
        int right = nums.length-1;
        while (nums[right] == numsSorted[right]){
            right--;
        }
        return right-left+1;
    }

    public boolean isSorted(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
}

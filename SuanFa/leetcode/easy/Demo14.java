package leetcode.easy;

import java.util.Arrays;
//二分法查找，返回的是排序后的数组中指定元素的位置，必须是升序的数组

public class Demo14 {
    public int search(int[] nums,int target){
        Arrays.sort(nums);
        int low=0,high=nums.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            int num = nums[mid];
            if (target==num){
                return mid;
            }else if (num>target){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
}

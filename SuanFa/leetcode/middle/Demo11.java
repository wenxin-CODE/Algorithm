package leetcode.middle;

//https://leetcode-cn.com/problems/circular-array-loop/
//快慢指针法
public class Demo11 {
    public boolean circularArrayLoop(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i]==0){
                continue;
            }
            int slow = i,fast = next(nums,i);
            while (nums[slow]*nums[fast]>0 && nums[slow]*nums[next(nums,fast)]>0){
                if(slow == fast){
                    if (slow != next(nums,slow)){
                        return true;
                    }else {
                        break;
                    }
                }
                slow = next(nums,slow);
                fast = next(nums,next(nums,fast));
            }
            int add = 1;
            while (nums[add]*nums[next(nums,add)]>0){
                int tmp = add;
                add = next(nums,add);
                nums[tmp] = 0;
            }
        }
        return false;
    }

    public int next(int[] nums,int cur){
        int n = nums.length;
        return ((cur+nums[cur])%n+n)%n;
    }
}

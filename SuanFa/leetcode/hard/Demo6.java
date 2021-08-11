package leetcode.hard;

import java.util.HashMap;
import java.util.Map;

public class Demo6 {
    public int numberOfArithmeticSlices(int[] nums){
        int ans = 0;
        int n = nums.length;
        Map<Long,Integer>[] f = new Map[n];
        for (int i = 0; i < n; i++) {
            f[i] = new HashMap<Long,Integer>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                long d = 1L*nums[i]-nums[j];
                int cnt = f[j].getOrDefault(d,0);
                ans += cnt;
                f[i].put(d,f[i].getOrDefault(d,0)+cnt+1);
//                如果插入的 key 对应的 value 已经存在，则执行 value 替换操作，返回旧的 value 值，如果不存在则执行插入，返回 null
// 以当前i为尾项的数目：
//cnt+1是由当前j位置确定的间隔为d的上一个尾项数目+1转移过来的
//而再加上f[i].getOrDefault(d, 0)，是因为要加上其他任何与当前j不同位置，但产生公差依然为d的数目

            }
        }
        return ans;
    }
}

package leetcode.middle;

//差分数组的性质是，当我们希望对原数组的某一个区间 [l,r][l,r] 施加一个增量\textit{inc}inc 时，差分数组 dd 对应的改变是：d[l]d[l] 增加 \textit{inc}inc，d[r+1]d[r+1] 减少 \textit{inc}inc。
// 这样对于区间的修改就变为了对于两个位置的修改。并且这种修改是可以叠加的，即当我们多次对原数组的不同区间施加不同的增量，我们只要按规则修改差分数组即可。
//https://leetcode-cn.com/problems/corporate-flight-bookings/solution/hang-ban-yu-ding-tong-ji-by-leetcode-sol-5pv8/
public class Demo16 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums = new int[n];
        for (int[] booking : bookings) {
            nums[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                nums[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

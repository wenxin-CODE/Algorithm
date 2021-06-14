package leetcode.easy;

//https://leetcode-cn.com/problems/guess-number-higher-or-lower/solution/cai-shu-zi-da-xiao-by-leetcode-solution-qdzu/
public class Demo4 {
        public int guessNumber(int n,int pick) {
            int left = 1, right = n;
            while (left < right) { // 循环直至区间左右端点相同
                int mid = left + (right - left) / 2; // 防止计算时溢出
                if (mid>pick) {
                    right = mid; // 答案在区间 [left, mid] 中
                } else {
                    left = mid + 1; // 答案在区间 [mid+1, right] 中
                }
            }
            // 此时有 left == right，区间缩为一个点，即为答案
            return left;
        }
}

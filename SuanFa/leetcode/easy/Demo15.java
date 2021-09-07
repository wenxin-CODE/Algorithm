package leetcode.easy;

//贪心算法，从头开始找满足条件最短的，找到一个加一
//https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/solution/fen-ge-ping-heng-zi-fu-chuan-by-leetcode-7y8u/

public class Demo15 {
    public int balanceStringSplit(String s){
        int ans = 0,d = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'L'){
                ++d;
            }else {
                --d;
            }
            if (d == 0){
                ++ans;
            }
        }
        return ans;
    }

}

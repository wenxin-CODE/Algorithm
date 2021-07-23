package leetcode.easy;

//https://leetcode-cn.com/problems/check-if-all-the-integers-in-a-range-are-covered/solution/jian-cha-shi-fou-qu-yu-nei-suo-you-zheng-5hib/
//使用差分数组
public class Demo6 {
    public boolean isCovered(int[][] ranges,int left,int right){
        int[] diff = new int[52];
        for(int[] range:ranges){
            ++diff[range[0]];
            --diff[range[1]+1];
        }
        int curr = 0;
        for (int i = 1; i <= 50; i++) {
            curr += diff[i];
            if (i>=left && i<=right && curr<=0){
                return false;
            }
        }
        return true;
    }
}

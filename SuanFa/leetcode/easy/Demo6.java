package leetcode.easy;

//https://leetcode-cn.com/problems/check-if-all-the-integers-in-a-range-are-covered/solution/jian-cha-shi-fou-qu-yu-nei-suo-you-zheng-5hib/
//使用差分数组
//自己列一个算[1,2],[3,4],[5,6]--(2,5)
//开头只加不减，如果要求区间全覆盖了，前面减的，后面会加上，总和不会小于等于0
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

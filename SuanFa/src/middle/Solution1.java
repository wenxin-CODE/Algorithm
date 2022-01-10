package src.middle;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public List<Integer> grayCode(int n){
        List<Integer> ret = new ArrayList<Integer>();
        ret.add(0);
        for (int i = 1; i <= n; i++) {
            int m = ret.size();
            for (int j = m-1;j >= 0;j--){
                ret.add(ret.get(j) | (1<<(i-1)));
//                1<<(i-1)表示把1向前移i-1位得到的二进制数  ；  a|b表示
//                进行或运算后，只有第一位由零变一，后面的不变，因为1<<(i-1)后面全是零
            }
        }
        return ret;
    }
}
//格雷编码：应用于确定扇形区域是否为相邻的，若只差一位，就是相邻的
//从第一列开始，列出i-1列的所有情况，则第i列就是i-1列镜面对称（镜面对称之后就能保证相邻两个只差一位），
// 然后前面的一半前面加零，后面的一半前面加一。以此类推置到n列
//https://leetcode-cn.com/problems/gray-code/solution/ge-lei-bian-ma-by-leetcode-solution-cqi7/
//https://www.bilibili.com/video/BV1nw411Z7r9?from=search&seid=17316306607335694609&spm_id_from=333.337.0.0
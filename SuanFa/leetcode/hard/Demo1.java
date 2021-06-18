package leetcode.hard;

public class Demo1 {
    public String smallestGoodBase(String n){
        long nVal = Long.parseLong(n);
//        将第一个参数用第二个参数进制来表示，如果不写第二个参数的话默认是十进制
        int mMax = (int)Math.floor(Math.log(nVal)/Math.log(2));
        for (int m = mMax; m > 1 ; m--) {
            int k = (int)Math.pow(nVal, 1.0 / m);
            long mul = 1,sum = 1;
            for (int i = 0; i < m; i++) {
                mul *= k;
                sum += mul;
            }
            if(sum==nVal){
                return Integer.toString(k);
            }
        }
        return Long.toString(nVal-1);
//        返回的是所选进制
//        char要用'';String要用""
    }
}

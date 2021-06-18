package leetcode.hard;

public class Demo1 {
    public String smallestGoodBase(String n){
        long nVal = Long.parseLong(n);
//        将第一个参数用第二个参数进制来表示，如果不写第二个参数的话默认是十进制
        int mMax = (int)Math.floor(Math.log(nVal)/Math.log(2));
//        mMax是最大的位数
        for (int m = mMax; m > 1 ; m--) {
            int k = (int)Math.pow(nVal, 1.0 / m);
//            对应位的进制数
            long mul = 1,sum = 1;
            for (int i = 0; i < m; i++) {
                mul *= k;
                sum += mul;
            }
            if(sum==nVal){
                return Integer.toString(k);
//                计算成功，返回可行的进制数
            }
        }
        return Long.toString(nVal-1);
//        返回的是输入数-1，把它作为进制数a，最低位是a的0次方，等于1
//        char要用'';String要用""
    }
}

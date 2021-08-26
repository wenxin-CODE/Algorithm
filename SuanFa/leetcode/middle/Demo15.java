package leetcode.middle;

import java.util.Arrays;
//贪心法，用最轻的和最重的组合作比较，穿上只能有两个人
//https://leetcode-cn.com/problems/boats-to-save-people/

public class Demo15 {
    public int numRescueBoats(int[] people,int limit){
        int ans = 0;
        Arrays.sort(people);
        int light = 0,heavy = people.length-1;
        while (light<=heavy){
            if (people[light]+people[heavy]<=limit){
                ++light;
            }
            --heavy;
            ++ans;
        }
        return ans;
    }
}

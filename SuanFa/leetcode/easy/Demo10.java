package leetcode.easy;

public class Demo10 {
    public boolean checkRecord(String s){
        int absents = 0,later = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'A'){
                absents++;
                if (absents >= 2){
                    return false;
                }
            }
            if (c == 'L') {

                later++;
                if (later >= 3){
                    return false;
                }
            }else {
                later = 0;
            }
        }
        return true;
    }
}

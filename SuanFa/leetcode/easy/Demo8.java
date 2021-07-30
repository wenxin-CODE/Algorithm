package leetcode.easy;

//https://leetcode-cn.com/problems/excel-sheet-column-number/solution/excelbiao-lie-xu-hao-by-leetcode-solutio-r29l/

public class Demo8 {
        public int titleToNumber(String columnTitle) {
            int number = 0;
            int multiple = 1;
            for (int i = columnTitle.length() - 1; i >= 0; i--) {
                int k = columnTitle.charAt(i) - 'A' + 1;
                number += k * multiple;
                multiple *= 26;
            }
            return number;
        }

}

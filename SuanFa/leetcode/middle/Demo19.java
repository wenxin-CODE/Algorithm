package leetcode.middle;

public class Demo19 {
    public int chalkReplacer(int[] chalk,int k){
        int n=chalk.length;
        if (chalk[0] > k) {
            return 0;
        }
//        求前缀和
        for (int i = 1; i < n; ++i) {
            chalk[i] += chalk[i - 1];
            if (chalk[i] > k) {
                return i;
            }
        }

//        取余
        k %= chalk[n - 1];
        return binarySearch(chalk, k);
    }

//    二分查找
    public int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

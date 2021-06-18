package leetcode.middle;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
    public int movingCount(int m, int n, int k) {
        if (k == 0) {
            return 1;
        }
        Queue<int[]> queue = new LinkedList<int[]>();
        // 向右和向下的方向数组，移动时只考虑这两个方向
        int[] dx = {0, 1};
        int[] dy = {1, 0};
//        记录能不能到达的数组vis
        boolean[][] vis = new boolean[m][n];
//        收纳当前可到达的数组，
        queue.offer(new int[]{0, 0});
        vis[0][0] = true;
        int ans = 1;//记录可到达个数
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
//            分两次，分别下移 和 右移
            for (int i = 0; i < 2; ++i) {
                int tx = dx[i] + x;
                int ty = dy[i] + y;
                if (tx < 0 || tx >= m || ty < 0 || ty >= n || vis[tx][ty] || get(tx) + get(ty) > k) {
                    continue;
                }
                queue.offer(new int[]{tx, ty});
                vis[tx][ty] = true;
                ans++;
            }
        }
        return ans;
    }

//获取各位上数字之和
    private int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}

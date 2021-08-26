package leetcode.easy;

public class Demo3  {

//    https://leetcode-cn.com/problems/SNJvJP/
//    矩形的圈数为 : (num+1)/2 向上取整
//当前坐标所在圈数 : 行号 , 列号 ,num-行号 ,num-列号 中最小的 +1 即为所在圈数
        public int orchestraLayout(int num, int xPos, int yPos) {
            int minx, miny;
            minx = num - xPos - 1 > xPos ? xPos : num - xPos - 1;
            miny = num - yPos - 1 > yPos ? yPos : num - yPos - 1;
            int min = minx > miny ? miny : minx;
            long s;
            s = num - min;
            s = s * min;
            s = s % 9;
            s = s * 4;
            s = s % 9;
            num = num - 2 * min;
            int x,y;
            x = xPos - min;
            y = yPos - min;
            if (x == 0) {
                //up
                s = s + 1 + y;
                s = s % 9;
            } else if (y == 0) {
                //left
                s = s + num + num - 1 + num - 1 + (num - x - 1);
                s = s % 9;
            } else if (x == num - 1) {
                //down
                s = s + num + num - 1 + (num - y - 1);
                s = s % 9;
            } else {
                //right
                s = s + num + x;
                s = s % 9;
            }
            return (int)(s==0?9:s);
        }

}

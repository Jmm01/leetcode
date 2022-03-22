package leetcode_06;

import java.util.HashMap;
import java.util.Map;

class DetectSquares {
    int[][] points;

    public DetectSquares() {
        points = new int[1001][1001];
    }

    public void add(int[] point) {
        int x = point[0];
        int y = point[1];
        points[x][y]++;
    }

    public int count(int[] point) {
        int count = 0;
        int x = point[0];
        int y = point[1];
        for (int i=0; i<1001; i++) {
            //如果目标点所在行存在其他点，计算两者间的距离作为正方形的边长
            if (points[x][i] != 0 && i != y) {
                //计算边长
                int bc = y > i ? y - i : i - y;
                int count1=0,count2=0;
                if(x+bc <= 1000)
                    //上边的正方形个数
                    count1 = points[x][i] * points[x+bc][i] * points[x+bc][y];

                if (x-bc >= 0)
                    //下边的正方形个数
                    count2 = points[x][i] * points[x-bc][i] * points[x-bc][y];

                count = count + count1 + count2;
            }
        }
        return count;
    }
}


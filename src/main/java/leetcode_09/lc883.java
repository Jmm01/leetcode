package leetcode_09;

public class lc883 {
    //883.三维形体投影的面积
    public int projectionArea(int[][] grid) {
        int m = grid.length; //行数
        int n = grid[0].length; //列数

        int upS = m * n; //上面的面积

        //每一行的最大值：左视图面积
        int leftS = 0;
        //计算0的个数；
        int zeroNum = 0;
        for(int i=0; i<m; i++){
            int temp = 0;
            for(int j=0; j<n; j++){
                if(grid[i][j] == 0)
                    zeroNum++;
                temp = Math.max(grid[i][j],temp);
            }
            leftS += temp;
        }
        //每一列的最大值：前视图面积
        int frontS = 0;
        for(int i=0; i<n; i++){
            int temp = 0;
            for(int j=0; j<m; j++){
                temp = Math.max(grid[j][i],temp);
            }
            leftS += temp;
        }

        return leftS+frontS+upS-zeroNum;
    }

    public static void main(String[] args) {
        lc883 lc = new lc883();
//        System.out.println(lc.projectionArea(new int[][]{{1, 2}, {3, 4}}));
        System.out.println(lc.projectionArea(new int[][]{{1, 0}, {0, 2}}));

    }
}

package leetcode_08;

public class lc661 {
    int m, n;
    int[][] grid;
    int[][] d = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,0},{0,1},{1,-1},{1,0},{1,1}};
    boolean inArea(int x, int y){
        return x>=0 && x<m && y>=0 && y<n;
    }

    //从grid[x][y]的位置开始，进行floodfill
    //保证（x,y）合法
    int grey(int x, int y){
        int count = 0;
        int sum = 0;
        for(int i=0; i<9; i++){
            int newx = x+d[i][0];
            int newy = y+d[i][1];
            if(inArea(newx, newy)){
                sum += grid[newx][newy];
                count++;
            }
        }
        return (int) Math.floor(sum/count);
    }

    public int[][] imageSmoother(int[][] img) {
        m = img.length;
        if(m == 0)
            return img;
        n = img[0].length;

        int[][] Res = new int[m][n];
        this.grid = img;

        int res = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                Res[i][j] = grey(i, j);
            }
        }
        return Res;
    }

    public static void main(String[] args) {
        lc661 lc = new lc661();
        lc.imageSmoother(new int[][]{{100,200,100},{200,50,200},{100,200,100}});
    }
}

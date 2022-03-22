package leetcode_07;

public class lc200 {
    int m, n;
    char[][] grid;
    int[][] d = {{0,1},{1,0},{0,-1},{-1,0}};

    boolean inArea(int x, int y){
        return x>=0 && x<m && y>=0 && y<n;
    }

    //从grid[x][y]的位置开始，进行floodfill
    //保证（x,y）合法，且grid[x][y]是没有被访问过的陆地
    void dfs(int x, int y){
        grid[x][y] = '2';
        for(int i=0; i<4; i++){
            int newx = x+d[i][0];
            int newy = y+d[i][1];
            if(inArea(newx, newy) &&  grid[newx][newy] == '1')
                dfs(newx,newy);
        }
    }


    public int numIslands(char[][] grid){
        m = grid.length;
        n = grid[0].length;
        this.grid = grid;

        int res = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                //如果遍历到某块陆地没有被标记过，就将岛屿数量加一
                //并且将依此陆地为起点深度搜索，将所有相连的陆地都标记。
                if(grid[i][j] == '1'){
                    res ++;
                    dfs(i, j);
                }
            }
        }
        return res;
    }
}

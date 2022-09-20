package leetcode_09;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lc417 {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res=new ArrayList();
        int m=heights.length,n=heights[0].length;
        //记录坐标地是否到达太平洋、大西洋
        boolean canReachP[][]=new boolean[m][n],canReachX[][]=new boolean[m][n];
        //上下左右出发，深度优先搜索
        for(int i=0;i<m;i++){
            dfs(heights,canReachP,i,0);
            dfs(heights,canReachX,i,n-1);
        }
        for(int j=0;j<n;j++){
            dfs(heights,canReachP,0,j);
            dfs(heights,canReachX,m-1,j);
        }
        //遍历记录，如果都可到达即可加入结果
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(canReachP[i][j]&&canReachX[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    public void dfs(int[][] heights,boolean[][] canReach,int i,int j){
        //如果已经扫描过可达就不用扫描
        if(canReach[i][j])return;
        //扫描过即说明可达，这也是逆流的优点
        canReach[i][j]=true;
        //上下左右深度搜索，越界就不搜索
        if(i-1>=0&&heights[i-1][j]>=heights[i][j]){dfs(heights,canReach,i-1,j);}
        if(j-1>=0&&heights[i][j-1]>=heights[i][j]){dfs(heights,canReach,i,j-1);}
        if(i+1<heights.length&&heights[i+1][j]>=heights[i][j]){dfs(heights,canReach,i+1,j);}
        if(j+1<heights[0].length&&heights[i][j+1]>=heights[i][j]){dfs(heights,canReach,i,j+1);}
    }

    public static void main(String[] args) {
        lc417 lc = new lc417();
        int[][] heights = new int[][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        //[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]
//        List<List<Integer>> heights = new ArrayList<>();
//        heights.add(Stream.of(1,2,2,3,5).collect(Collectors.toList()));
//        heights.add(Stream.of(3,2,3,4,4).collect(Collectors.toList()));
//        heights.add(Stream.of(2,4,5,3,1).collect(Collectors.toList()));
//        heights.add(Stream.of(6,7,1,4,5).collect(Collectors.toList()));
//        heights.add(Stream.of(5,1,1,2,4).collect(Collectors.toList()));
        lc.pacificAtlantic(heights);
    }
}

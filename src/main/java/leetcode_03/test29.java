package leetcode_03;

public class test29 {
    //62.不同路径
    //动态规划，dp[i][j] = dp[i-1][j] + dp[i][j-1]
    //到[i,j]位置的路径条数为到[i-1,j]和到[i,j-1]的路径条数之和
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}

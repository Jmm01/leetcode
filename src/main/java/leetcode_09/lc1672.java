package leetcode_09;

public class lc1672 {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int i=0; i<accounts.length; i++){
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            res = Math.max(sum,res);
        }
        return res;
    }
}





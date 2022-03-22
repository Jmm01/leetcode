package leetcode_07;

import java.util.ArrayList;
import java.util.List;

public class lc1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        int m = matrix.length, n = matrix[0].length;
        List<Integer> minNums = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int cur = matrix[i][j];
                minNum = Math.min(cur,minNum);
            }
            minNums.add(minNum);
            minNum = Integer.MAX_VALUE;
        }

        for(int j=0; j<n; j++){
            for(int i=0; i<m; i++){
                int cur = matrix[i][j];
                maxNum = Math.max(cur,maxNum);
            }
            if(minNums.contains(maxNum))
                res.add(maxNum);
            maxNum = Integer.MIN_VALUE;
        }
        return res;
    }
}

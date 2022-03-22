package leetcode_07;

import java.util.Arrays;
import java.util.Comparator;

public class lc435 {
    //动态规划->贪心算法
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0)
            return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] != o2[1]){
                    return o1[1] - o2[1];
                }else
                    return o1[0] - o2[0];
            }
        });

        //memo[i]表示使用intervals[0...i]的区间能构成的最长不重叠区间序列
//        int[] memo = new int[intervals.length];
//        for(int i=0; i<memo.length; i++)
//            memo[i] = 1;
//        int res = 1;
//        for(int i=1; i<intervals.length; i++){
//            for(int j=0; j<i; j++){
//                //如果当前的区间开始大于前面的区间结束，那么它可以跟在前面这个区间后面
//                if(intervals[i][0] >= intervals[j][1])
//                    memo[i] = Math.max(memo[i], 1+memo[j]);
//            }
//            res = Math.max(res, memo[i]);
//        }

        int res = 1;
        int pre = 0;
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] >= intervals[pre][1]){
                res++;
                pre = i;
            }
        }

        return intervals.length - res;

    }

    public static void main(String[] args) {
        lc435 lc = new lc435();
        System.out.println(lc.eraseOverlapIntervals(new int[][]{{1, 2}}));
    }
}

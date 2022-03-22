package DP;

public class lc746 {
    public int minCostClimbingStairs(int[] cost){
        int n = cost.length;
        int pre1 = cost[0], pre2 = cost[1];
        if(n == 2)
            return Math.min(pre1,pre2);
        for(int i=2; i<n; i++){
            int temp  = Math.min(pre1,pre2) + cost[i];
            pre1 = pre2;
            pre2 = temp;
        }
        return Math.min(pre1,pre2);
    }

    public static void main(String[] args) {
        lc746 lc = new lc746();
        System.out.println(lc.minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println(lc.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));

    }

}

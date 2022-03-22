package DP;

public class lc70 {
    public int climbStairs(int n) {
        int[] stairs = new int[]{1,2};
        if(n < 3)
            return stairs[n-1];
        for(int i=3; i<n; i++){
            if(i%2 == 1)
                stairs[0] = stairs[0]+stairs[1];
            else
                stairs[1] = stairs[0]+stairs[1];
        }
        return stairs[0]+stairs[1];
    }

    public static void main(String[] args) {
        lc70 lc = new lc70();
//        System.out.println(lc.climbStairs(1));
//        System.out.println(lc.climbStairs(2));
//        System.out.println(lc.climbStairs(3));
        System.out.println(lc.climbStairs(4));
        System.out.println(lc.climbStairs(5));


    }
}

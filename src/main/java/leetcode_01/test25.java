package leetcode_01;

public class test25 {
    /*public int climbStairs(int n) {
        if(n==1||n==2)
            return n;
        else
            return climbStairs(n-1)+climbStairs(n-2);
    }*/
    public int climbStairs(int n) {
        int res = 0;
        if(n==1||n==2)
            return n;
        else {
            int temp1 = 1;
            int temp2 = 2;
            for(int i=3; i<=n; i++){
                res= temp1+temp2;
                temp1 = temp2;
                temp2 = res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test25 t =new test25();
        System.out.println(t.climbStairs(10));
    }
}

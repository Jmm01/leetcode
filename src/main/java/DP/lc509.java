package DP;

public class lc509 {
    /**动态规划模板
     * # 初始化 base case
     * dp[0][0][...] = base
     * # 进行状态转移
     * for 状态1 in 状态1的所有取值：
     *     for 状态2 in 状态2的所有取值：
     *         for ...
     *             dp[状态1][状态2][...] = 求最值(选择1，选择2...)
     *
     * int fib(int N) {
     *     vector<int> dp(N + 1, 0);
     *     // base case
     *     dp[1] = dp[2] = 1;
     *     for (int i = 3; i <= N; i++)
     *         dp[i] = dp[i - 1] + dp[i - 2];
     *     return dp[N];
     * }
     *
     * @param n
     * @return
     */
    public int fib(int n) {

         int a = 0;
         int b = 1;
         if(n == 0 )
             return a;
         else if (n == 1)
             return b;
         else {
             for (int i = 2; i < n; i++) {
                 if (i % 2 == 0)
                     a = a + b;
                 else
                     b = a + b;
             }
         }
         return a+b;
    }

    public static void main(String[] args) {
        lc509 lc = new lc509();
        System.out.println(lc.fib(4));
    }
}

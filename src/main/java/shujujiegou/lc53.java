package shujujiegou;

public class lc53 {
    //动态规划
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for(int i=1; i<nums.length; i++){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            res = Math.max(res,dp[i]);

        }
        return res;
    }

    /**
     * public int maxSubArray(int[] nums) {
     *     int max = nums[0];
     *     int sum = 0;
     *     for(int i=0; i<nums.length; i++){
     *         sum= sum + nums[i];
     *         if(sum>max){
     *             max = sum;
     *         }
     *         if(sum < 0) {
     *             sum = 0;
     *         }
     *     }
     *     return max;
     * }
     *
     */

    public static void main(String[] args) {
        lc53 lc = new lc53();
        System.out.println(lc.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}

package leetcode_07;

public class lc300 {
    //时间复杂度O(n^2)动态规划
    //求最长的递增子序列长度
    //相关题 376，
    public int lengthOfLIS(int[] nums) {

        if(nums.length == 0)
            return 0;

        //memo[0]表示以nums[i]为结尾的最长上升子序列的长度
        int[] memo = new int[nums.length];
        for(int i=0; i<memo.length; i++)
            memo[i] = 1;

        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[j] < nums[i])
                    memo[i] = Math.max(memo[i], 1+memo[j]);
            }
        }
        int res = 1;
        for(int i=0; i<nums.length; i++)
            res = Math.max(res, memo[i]);

        return res;
    }

    public static void main(String[] args) {
        lc300 lc = new lc300();
        System.out.println(lc.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}

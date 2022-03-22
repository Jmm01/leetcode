package DP;

public class lc198 {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
//        只偷第一家
        int pre1 = nums[0];
        int pre2 = Math.max(nums[0],nums[1]);
        for(int i=2; i<nums.length; i++){
            int cur = Math.max(pre1+nums[i],pre2);
            pre1 = pre2;
            pre2 = cur;
        }
        return pre2;
    }

    public static void main(String[] args) {
        lc198 lc = new lc198();
        System.out.println(lc.rob(new int[]{1, 2, 3, 1}));
        System.out.println(lc.rob(new int[]{2, 7, 9 , 3, 1}));
        System.out.println(lc.rob(new int[]{2, 1, 1 , 2}));
    }

}

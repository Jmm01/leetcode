package DP;

public class lc213 {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);

        //0 - n-2个元素
        int pre1 = nums[0];
        int pre2 = Math.max(nums[0],nums[1]);
        for(int i=2; i<nums.length-1; i++){
            int cur = Math.max(pre1+nums[i],pre2);
            pre1 = pre2;
            pre2 = cur;
        }

        //1 - n-1个元素
        int pre3 = nums[1];
        int pre4 = Math.max(nums[1],nums[2]);
        for(int i=3; i<nums.length; i++){
            int cur = Math.max(pre3+nums[i],pre4);
            pre3 = pre4;
            pre4 = cur;
        }
        return Math.max(pre2,pre4);
    }

    public static void main(String[] args) {
        lc213 lc = new lc213();
        System.out.println(lc.rob(new int[]{2, 3, 2}));
        System.out.println(lc.rob(new int[]{1,2, 3, 1}));
        System.out.println(lc.rob(new int[]{1,2,3}));
    }
}

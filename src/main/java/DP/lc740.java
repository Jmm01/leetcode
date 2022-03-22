package DP;

import java.util.*;

public class lc740 {
    //时间复杂度O(n)
    //空间复杂度O(1)
    public int deleteAndEarn(int[] nums) {
        int max = nums[0];
        for (int i=0; i<nums.length; i++){
            max = Math.max(nums[i],max);
        }
        int[] sum = new int[max+1];
        for(int i=0; i<nums.length; i++){
            sum[nums[i]] += nums[i];
        }
        int pre1 = sum[0];
        int pre2 = Math.max(sum[0],sum[1]);
        for(int i=2; i<sum.length; i++){
            int cur = Math.max(pre1+sum[i],pre2);
            pre1 = pre2;
            pre2 = cur;
        }
        return pre2;
    }

    public static void main(String[] args) {
        lc740 lc = new lc740();
        System.out.println(lc.deleteAndEarn(new int[]{3,4,2}));//6
        System.out.println(lc.deleteAndEarn(new int[]{2,2,3,3,3,4}));//9
        System.out.println(lc.deleteAndEarn(new int[]{1,3}));//4
        System.out.println(lc.deleteAndEarn(new int[]{1,1,1,2,4,5,5,5,6}));//18
        System.out.println(lc.deleteAndEarn(new int[]{1,6,3,3,8,4,8,10,1,3}));//43

    }
}

package leetcode_09;

import java.util.Arrays;

public class lc961 {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i])
                return nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        lc961 lc = new lc961();
        System.out.println(lc.repeatedNTimes(new int[]{1,2,3,3}));
    }
}

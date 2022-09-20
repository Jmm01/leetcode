package leetcode_08;

import java.util.Arrays;

public class lc453 {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for(int i=0; i< nums.length; i++){
            min = Math.min(nums[i],min);
            sum += nums[i];
        }
        return sum-nums.length*min;
    }

    public static void main(String[] args) {
        lc453 lc = new lc453();
        System.out.println(lc.minMoves(new int[]{1, 2, 3}));
    }
}

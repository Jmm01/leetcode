package leetcode_05;

import java.util.Arrays;

public class lc01 {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1,sum = 0;
        while(l < r){
            sum = nums[r] + nums[l];
            if(sum == target)
                return new int[]{l,r};
            else if(sum > target)
                r--;
            else
                l++;
        }
        return new int[2];
    }

    public static void main(String[] args) {

    }
}

package leetcode_07;

import java.util.Arrays;

public class lc1984 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0, r=0+k-1;
        int res = Integer.MAX_VALUE;
        while (r<nums.length){
            res = Math.min(res,nums[r++]-nums[l++]);
        }
        return res;

    }

    public static void main(String[] args) {
        lc1984 lc = new lc1984();
        System.out.println(lc.minimumDifference(new int[]{90},1));
    }
}

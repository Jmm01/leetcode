package leetcode_08;

public class lc2104 {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long ret = 0;
        for (int i = 0; i < n; i++) {
            int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
            for (int j = i; j < n; j++) {
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                ret += maxVal - minVal;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        lc2104 lc = new lc2104();
        System.out.println(lc.subArrayRanges(new int[]{4, -2, -3, 4, 1}));
    }

}

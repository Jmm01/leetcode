package leetcode_02;

public class test2 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i =0; i<n; i++){
            res = res^nums[i]^i;
        }
        res = res^n;
        return  res;
    }
}

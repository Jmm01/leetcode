package leetcode_05;

public class lc209 {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=-1;
        int sum=0;
        int minLen=nums.length+1;
        while(l < nums.length){
            if(sum < target && r<nums.length-1)
                sum += nums[++r];
            else
                sum -= nums[l++];
            if(sum >= target)
                minLen = Math.min(minLen,r-l+1);
        }
        if(minLen == nums.length+1)
            return 0;
        return minLen;
    }

    public static void main(String[] args) {
        lc209 l = new lc209();
        System.out.println(l.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }
}

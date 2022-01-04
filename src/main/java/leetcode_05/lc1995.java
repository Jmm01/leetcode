package leetcode_05;

import java.util.Arrays;

public class lc1995 {
    public int countQuadruplets(int[] nums) {
        int res=0;
        for(int a=0; a<nums.length-3; a++){
            for(int b=a+1; b<nums.length-2; b++){
                for(int c=b+1; c<nums.length-1; c++){
                    for(int d=c+1; d<nums.length; d++){
                        if(nums[a]+nums[b]+nums[c]==nums[d]){
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc1995 l = new lc1995();
        System.out.println(l.countQuadruplets(new int[]{28,8,49,85,37,90,20,8}));
    }
}

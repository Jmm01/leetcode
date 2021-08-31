package leetcode_04;

public class test16 {

    /**
     * 137.只出现一次的数字II
     * 0^x = x;
     * x^x = 0;
     * x&~x = 0;
     * x&~0 = x;
     * 1.x出现第一次时:a=x,b=0;
     * 2.x出现第二次时:a=0,b=x;
     * 3.x出现第三次时:a=0,b=0;
     */
    public int singleNumber(int[] nums) {
        int a=0,b=0;
        for(int num:nums){
            a = (a ^ num) & ~b;
            b = (b ^ num) & ~a;
        }
        return a;
    }
}

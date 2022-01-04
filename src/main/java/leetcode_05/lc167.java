package leetcode_05;

import java.util.Arrays;

public class lc167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1,sum = 0;
        while(l < r){
            sum = numbers[r] + numbers[l];
            if(sum == target)
                return new int[]{l+1,r+1};
            else if(sum > target)
                r--;
            else
                l++;
        }
        return new int[2];
    }

    public static void main(String[] args) {
        lc167 l = new lc167();
        System.out.println(l.twoSum(new int[]{2,3,4},6));
    }
}

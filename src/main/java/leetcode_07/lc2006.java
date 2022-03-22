package leetcode_07;

import java.util.HashMap;
import java.util.Hashtable;

public class lc2006 {
    public int countKDifference(int[] nums, int k) {
//        int res = 0;
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(Math.abs(nums[i]-nums[j]) == k)
//                    res++;
//            }
//        }
//        return res;
        int res = 0;
        HashMap<Integer,Integer> table = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            res += table.getOrDefault(nums[i]-k,0) + table.getOrDefault(nums[i]+k,0);
            table.put(nums[i],table.getOrDefault(nums[i],0)+1);
        }
        return res;
    }

    public static void main(String[] args) {
        lc2006 lc = new lc2006();
        System.out.println(lc.countKDifference(new int[]{1,2,2,1},1));
    }

}

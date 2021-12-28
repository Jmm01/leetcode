package leetcode_03;

import java.util.TreeSet;

public class test1 {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length < 2)
            return false;
//        boolean res = false;
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i=0; i<nums.length; i++)
//            if(set.contains(nums[i])){
//                res = true;
//                break;
//            }
            set.add(nums[i]);
        return set.size()<nums.length;
    }

    public static void main(String[] args) {
        test1 t = new test1();
        System.out.println(t.containsDuplicate(new int[]{}));
    }
}

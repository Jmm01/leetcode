package leetcode_02;

import java.util.HashSet;
import java.util.TreeSet;

public class test16 {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int num:nums)
            set.add(num);
        if(set.size()==1)  return set.first();
        if(set.size()==2)  return set.last()>set.first()?set.last() :set.first();
        int[] res = new int[3];
        for(int i = 0 ; i<3; i++){
            int temp = set.first();
            for(int num:set)
                temp = num>temp?num :temp;
            res[i] = temp;
            set.remove(temp);
        }
            return res[2];
    }

    public static void main(String[] args) {
        test16 t = new test16();
        int[] nums = new int[]{1,2,3,4,5,6,7,8,4,5,3,2,1};
        System.out.println(t.thirdMax(nums));
    }
}

package leetcode_02;

import java.util.ArrayList;
import java.util.List;

public class test26 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for(int i=0; i<nums.length; i++){
            int size = res.size();
            for(int j=0; j<size; j++){
                List<Integer> temp = new ArrayList<Integer>(res.get(j));
                temp.add(nums[i]);
                res.add(temp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test26 t = new test26();
        System.out.println(t.subsets(new int[]{1,2,3}));
    }

}

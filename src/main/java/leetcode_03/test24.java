package leetcode_03;

import java.util.*;

public class test24 {
    //回溯法，不理解
    public List<List<Integer>> permute(int[] nums) {
        //存储结果集
        List<List<Integer>> ress = new ArrayList<List<Integer>>();
        List<Integer> res = new ArrayList<Integer>();
        backtrack(ress, res,nums);
        return ress;
    }
    private void backtrack(List<List<Integer>> ress, List<Integer> res,int[] nums) {
        if(res.size() == nums.length){
            ress.add(res);
            return;
        }
        for(int num:nums){
            if(!res.contains(num)){
                res.add(num);
                backtrack(ress,res,nums);
                res.remove(res.size()-1);
            }
        }
    }

}

package leetcode_09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class lc398   {

    static class Solution {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        public Solution(int[] nums) {
            for(int i=0; i<nums.length; i++){
                ArrayList list = map.getOrDefault(nums[i],new ArrayList<>());
                list.add(i);
                map.put(nums[i],list);
            }
        }

        public int pick(int target) {
            ArrayList<Integer> list = map.get(target);
            Random index = new Random();
            int i = index.nextInt(list.size());
            return list.get(i);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,3,3};
        Solution obj = new Solution(nums);
        int param_1 = obj.pick(3);
        System.out.println(param_1);
    }


}

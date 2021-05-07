package leetcode_02;

import java.util.ArrayList;
import java.util.List;

public class test19 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List list = new ArrayList();
        for(int i:nums) {
            int temp = Math.abs(i) - 1;
            nums[temp] = -Math.abs(nums[temp]);
        }
        for(int i=0; i<nums.length; i++){
            if (nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        test19 t = new test19();
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(t.findDisappearedNumbers(nums));
    }
}

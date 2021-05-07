package leetcode_02;

import java.util.TreeMap;

public class test25 {
    public void sortColors(int[] nums) {
//        if(nums.length == 1 || nums.length == 0)
//            return;
//        else {
//            int min = 0;
//            int k=0;
//            while (k<nums.length){
//                min = k;
//                for(int i=k; i<nums.length; i++)
//                    min = nums[i]<nums[min]?i:min;
//                if(min != k){
//                    int temp = nums[k];
//                    nums[k] = nums[min];
//                    nums[min] = temp;
//                }
//                k++;
//            }
//        }
        if(nums.length == 1 || nums.length == 0)
            return;
        TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                if(map.get(0) == null)
                    map.put(0,1);
                else
                    map.put(0,map.get(0)+1);
            }else if(nums[i] == 1){
                if(map.get(1) == null)
                    map.put(1,1);
                else
                    map.put(1,map.get(1)+1);
            }else if(nums[i] == 2){
                if(map.get(2) == null)
                    map.put(2,1);
                else
                    map.put(2,map.get(2)+1);
            }
        }
        int l0 = map.get(0)==null?0:map.get(0);
        int l1 = map.get(1)==null?0:map.get(1);
        int l2 = map.get(2)==null?0:map.get(2);
        for(int i=0; i<l0; i++)
            nums[i] = 0;
        for(int i=l0; i<l0+l1; i++)
            nums[i] = 1;
        for(int i=l0+l1; i<nums.length; i++)
            nums[i] = 2;
    }

    public static void main(String[] args) {
        test25 t = new test25();
        int[] nums = new int[]{0,0,0,1,0};
        t.sortColors(nums);
    }

}

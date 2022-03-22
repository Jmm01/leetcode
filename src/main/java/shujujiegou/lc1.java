package shujujiegou;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lc1 {
    public int[] twoSum(int[] nums, int target){
//        int[] res = new int[2];
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i]+nums[j] == target) {
//                    res[0] = i;
//                    res[1] = j;
//                }
//            }
//        }
//        return res;

        Map<Integer,Integer> hashtable = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
            if(hashtable.containsKey(target-nums[i])){
                return new int[]{hashtable.get(target-nums[i]),i};
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }
}

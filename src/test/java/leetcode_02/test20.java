package leetcode_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
//class Solution {
//    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//        int n = nums.length;
//        TreeSet<Long> ts = new TreeSet<>();
//        for (int i = 0; i < n; i++) {
//            Long u = nums[i] * 1L;
//            // 从 ts 中找到小于等于 u 的最大值（小于等于 u 的最接近 u 的数）
//            Long l = ts.floor(u);
//            // 从 ts 中找到大于等于 u 的最小值（大于等于 u 的最接近 u 的数）
//            Long r = ts.ceiling(u);
//            if(l != null && u - l <= t) return true;
//            if(r != null && r - u <= t) return true;
//            // 将当前数加到 ts 中，并移除下标范围不在 [max(0, i - k), i) 的数（维持滑动窗口大小为 k）
//            ts.add(u);
//            if (i >= k) ts.remove(nums[i - k] * 1L);
//        }
//        return false;
//    }
//}
public class test20 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet();
        for(int i=0; i<nums.length; i++){
            Long num = (long)nums[i];
            Long l = set.floor(num);
            Long r = set.ceiling(num);
            if(l!=null && Math.abs(num-l) <= t)
                return true;
            if(r!=null && Math.abs(num-r) <= t)
                return true;
            set.add(num);
            if(i >= k)
                set.remove((long)nums[i-k]);
        }
        return false;
    }

    public static void main(String[] args) {
        test20 t =new test20();
        int[] nums = new int[]{1,5,9,1,5,9};
        System.out.println(t.containsNearbyAlmostDuplicate(nums,2,3));
    }
}

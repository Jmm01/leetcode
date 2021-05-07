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
//            // �� ts ���ҵ�С�ڵ��� u �����ֵ��С�ڵ��� u ����ӽ� u ������
//            Long l = ts.floor(u);
//            // �� ts ���ҵ����ڵ��� u ����Сֵ�����ڵ��� u ����ӽ� u ������
//            Long r = ts.ceiling(u);
//            if(l != null && u - l <= t) return true;
//            if(r != null && r - u <= t) return true;
//            // ����ǰ���ӵ� ts �У����Ƴ��±귶Χ���� [max(0, i - k), i) ������ά�ֻ������ڴ�СΪ k��
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

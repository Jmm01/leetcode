package leetcode_06;

import java.util.HashSet;

public class lc219 {
    //存在重复元素II 滑动窗口
    //时间复杂度：O(n);空间复杂度：O(k);
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0,r=-1;
        HashSet<Integer> set = new HashSet();
        while(r < nums.length-1){
            int cur = nums[++r];
            if(set.contains(cur))
                return true;
            else
                set.add(cur);
            if(r-l == k)
                set.remove(nums[l++]);
        }
        return false;
    }

    public static void main(String[] args) {
        lc219 l = new lc219();
        System.out.println(l.containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }
}

package leetcode_09;

import java.util.*;

class RandomizedSet {
    //lc380
    static int[] nums = new int[200010];
    Random random = new Random();
    Map<Integer,Integer> map = new HashMap<>();
    int idx = -1;

    public RandomizedSet() {
    }

    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        else {
            nums[++idx] = val;
            map.put(val,idx);
        }
        return true;
    }

    /**
     * 使用哈希表判断 val 是否存在，不存在的话返回 false，
     * 否则从哈希表中将 val 删除，同时取出其所在 nums 的下标 loc，
     * 然后将 nums[idx] 赋值到 loc 位置，
     * 并更新 idx（含义为将原本处于 loc 位置的元素删除），
     * 同时更新原本位于 idx 位置的数在哈希表中的值为 loc
     * （若 loc 与 idx 相等，说明删除的是最后一个元素，这一步可跳过）；
     */
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        else {
            int index = map.remove(val);
            if(index != idx){
                map.put(nums[idx],index);
            }
            nums[index] = nums[idx--];
        }
        return true;
    }

    public int getRandom() {
        return nums[random.nextInt(idx + 1)];
    }
}

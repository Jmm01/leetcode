package leetcode_08;

import java.util.TreeMap;

public class lc198 {
    public int bestRotation(int[] nums) {
        TreeMap<Integer,Integer> treeMap = new TreeMap();
        for (int i=nums.length-1; i>=0; i--){
            int c = rotation(nums,i);
            treeMap.put(c,i);
        }
        return treeMap.lastEntry().getValue();
    }

    //数组nums按照k进行轮调所得分数
    //长度为len的数组按照k轮调后。
    //k...len-1位置的元素索引变为index-k
    //0...k-1位置的元素索引变为index+len-k
    private int rotation(int[] nums, int k){
        int res = 0;
        for(int i=0; i<k; i++){
            int index = i+nums.length-k;
            if(nums[i] <= index)
                res++;
        }
        for(int i=k; i<nums.length; i++){
            int index = i-k;
            if(nums[i] <= index)
                res++;
        }
        return res;
    }


    public static void main(String[] args) {
        lc198 lc = new lc198();
//        System.out.println(lc.bestRotation(new int[]{2, 3, 1, 4, 0}));
        System.out.println(lc.bestRotation(new int[]{1, 3, 0, 2, 4}));
    }
}

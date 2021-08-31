package leetcode_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test10 {
    //给你一个包含 n 个整数的数组?nums，判断?nums?中是否存在三个元素 a，b，c ，
    // 使得?a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
    //双指针法，时间复杂度n^2。
    public List<List<Integer>> threeSum(int[] nums) {
        //定义一个保存结果的lists
        List<List<Integer>> ress = new ArrayList<List<Integer>>();
        //如果nums的长度小于3，直接返回空。
        if(nums.length < 3)
            return ress;
        //把nums的元素排序
        Arrays.sort(nums);

        //以数组第i个元素为基础，遍历它与它右边的区间两端的指针之和是否为0。
        for(int i=0; i<nums.length; i++){
            //排序后的数组如果某个位置大于0，那它后面的数也都大于0，三个数的和不可能为0，直接返回结果集。
            if(nums[i] > 0)
                return ress;
            //如果某个元素和上一个相邻的元素重复就跳过，避免结果集重复。i>0是为了防止[0,0,0]的情况。
            if(i>0 && nums[i] == nums[i-1])
                continue;
            //定义左右指针，左指针为i+1，右指针为nums.length-1
            int cur = nums[i];
            int R = nums.length-1;
            int L = i+1;
            //只要左右指针不相遇，就向中间遍历。
            while (L < R){
                if(cur + nums[R] + nums[L] == 0){
                    List res = new ArrayList();
                    res.add(cur);
                    res.add(nums[L]);
                    res.add(nums[R]);
                    ress.add(res);
                    //跳过重复元素,例如[0,1,1,3],L=1时，L++，L=2，此时跳到了重复的元素这里，因此判断完之后还需要++操作。
                    while(L < R && nums[L+1] == nums[L])
                        L++;
                    while(L < R && nums[R-1] == nums[R])
                        R--;
                    //双指针都移动，一个值变大，一个值变小。
                    L++;
                    R--;
                }else if(cur + nums[R] + nums[L] > 0){
                    //这种情况说明数大了，因此只移动右指针，和变小。
                    R--;
                }else {
                    //这种情况说明数小了，因此只移动左指针，和变大。
                    L++;
                }
            }
        }
        return ress;

    }

    public static void main(String[] args) {
        test10 t = new test10();
        int[] nums = new int[]{0};
        System.out.println(t.threeSum(nums));
    }

}

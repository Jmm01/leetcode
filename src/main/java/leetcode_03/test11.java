package leetcode_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test11 {
    //给定一个包括?n 个整数的数组?nums?和 一个目标值?target。
    // 找出?nums?中的三个整数，使得它们的和与?target?最接近。
    // 返回这三个数的和。假定每组输入只存在唯一答案。
    public int threeSumClosest(int[] nums, int target) {
        //定义ruturn的变量
        int res = 0;
        //nums只要三个元素的情况
        if(nums.length == 3)
            return res = nums[0] + nums[1] + nums[2];
        //对数组排序
        Arrays.sort(nums);
        //判断target最大和最小情况
        int len = nums.length;
        int max = nums[len-1] + nums[len-2] + nums[len-3];
        int min = nums[0] + nums[1] + nums[2];
        if(target >= max)
            return res = max;
        if(target <= min)
            return res = min;
        //当target的值在min和max之间时
        //以数组第i个元素为基础，遍历它与它右边的区间两端的指针之和与target的差距res。
        int oldgap = target - min;
        res = min;
        for(int i=0; i<nums.length; i++){
            //如果某个元素和上一个相邻的元素重复就跳过，避免结果集重复。
            if( i>0 && nums[i] == nums[i-1])
                continue;
            //定义左右指针，左指针为i+1，右指针为nums.length-1
            int cur = nums[i];
            int R = nums.length-1;
            int L = i+1;
            //只要左右指针不相遇，就向中间遍历。
            while (L < R){
                int sum = cur + nums[R] + nums[L];
                int gap = target - sum;
                //差距为0时最接近，直接返回。
                if(gap == 0) {
                    return res = sum;
                }else{
                    if(Math.abs(gap) < Math.abs(oldgap)) {
                        //如果差距变小，就更新res。
                        oldgap = gap;
                        res = sum;
                    }
                    if(gap > 0)
                        //这种情况说明数小了，因此只移动左指针，和变大。
                        L++;
                    else
                        //这种情况说明数大了，因此只移动右指针，和变小。
                        R--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        test11 t = new test11();
        int[] nums = new int[]{-1,0,1,1,55};
        System.out.println(t.threeSumClosest(nums,3));
    }
}

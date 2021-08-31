package leetcode_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test15 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //定义一个保存结果的lists
        List<List<Integer>> ress = new ArrayList<List<Integer>>();
        //如果nums的长度小于4，直接返回空。
        if(nums.length < 4)
            return ress;
        //把nums的元素排序
        Arrays.sort(nums);
        //以数组第i,j元素为基础，遍历它与它右边的区间两端的指针之和是否为target。
        for(int j=0; j<nums.length;j++){
            //如果某个元素和上一个相邻的元素重复就跳过，避免结果集重复。
            if(j>0 && nums[j] == nums[j-1])
                continue;
            for(int i=j+1; i<nums.length; i++){
                //定义左右指针，左指针为i+1，右指针为nums.length-1
                int cur1 = nums[j];
                int cur2 = nums[i];
                int R = nums.length-1;
                int L = i+1;
                //只要左右指针不相遇，就向中间遍历。
                while (L < R){
                    if(cur1 + cur2 + nums[R] + nums[L] == target){
                        List res = new ArrayList();
                        res.add(cur1);
                        res.add(cur2);
                        res.add(nums[L]);
                        res.add(nums[R]);
                        ress.add(res);
                        //跳过重复元素,例如[0,1,1,3],L=1时，L++，L=2，此时跳到了重复的元素这里，因此判断完之后还需要++操作。
                        while(L < R && nums[L+1] == nums[L])
                            L++;
                        while(L < R && nums[R-1] == nums[R])
                            R--;
                        while(i<L && nums[i+1] == nums[i])
                            i++;
                        //双指针都移动，一个值变大，一个值变小。
                        L++;
                        R--;
                    }else if(cur1 + cur2 + nums[R] + nums[L] > target){
                        //这种情况说明数大了，因此只移动右指针，和变小。
                        R--;
                    }else {
                        //这种情况说明数小了，因此只移动左指针，和变大。
                        L++;
                    }
                }
            }
        }

        return ress;
    }

    public static void main(String[] args) {
        test15 t = new test15();
        int[] nums = new int[]{1,-2,-5,-4,-3,3,3,5};
        System.out.println(t.fourSum(nums,-11));
    }
}

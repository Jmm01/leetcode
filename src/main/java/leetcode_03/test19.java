package leetcode_03;

import java.util.Arrays;

public class test19 {
    //实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
    //如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
    //必须 原地 修改，只允许使用额外常数空间。
    public int[] nextPermutation(int[] nums) {
        //判断是否为降序排列
        Boolean flag = true;
        for(int i=0; i<nums.length-1; i++){
            //如果存在nums[i] < nums[i]，说明不是最大的排列，
            if(nums[i] < nums[i+1]){
                flag = false;
                break;
            }
        }
        //如果是true,降序排列，就不存在更大的排列，返回最小值。
        if(flag){
            Arrays.sort(nums);
        }else {
            //从后面查找需要交换的数字的位置
            for(int i=nums.length-1; i>0; i--){
                int after = nums[i];
                int before = nums[i-1];
                //before为需要被交换的小数字
                if(after > before){
                    //寻找从i到nums.length-1，比before大的数值中最小的一个
                    int index = i;
                    for(int j=i; j<nums.length; j++ ){
                        if(nums[j] < after && nums[j] > before) {
                            after = nums[j];
                            index = j;
                        }
                    }
                    //交换before和此时更新后最小的after的位置
                    int temp = nums[i-1];
                    nums[i-1] = nums[index];
                    nums[index] = temp;
                    //将i后面的数字按照升序排列，确保这个是下一个最大值
                    Arrays.sort(nums,i,nums.length);
                    break;
                }
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        test19 t = new test19();
        System.out.println(t.nextPermutation(new int[]{1,3,2}));
    }
}

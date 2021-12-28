package leetcode_03;

public class test20 {
    //递归，二分查找
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        //如果数组为空
        if (nums.length == 0){
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        //如果数组只有一个元素
        if (nums.length == 1){
            if(target == nums[0]){
                res[0] = 0;
                res[1] = 0;
                return res;
            }else {
                res[0] = -1;
                res[1] = -1;
                return res;
            }
        }
        return searchRange(nums, 0, nums.length-1, target,res);
    }
    //私有函数，从nums数组的L到R的范围查找target
    private int[] searchRange(int[] nums, int L, int R, int target,int[] res){
        int  left;
        int right;
        //target小于数组的最小值或target大于数组的最大值
        if(target<nums[L] || target>nums[R]){
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        //定义中间位置的索引
        int index = (R-L)/2 + L;
        //如果中间位置的num和target相等，就由此向两边查找同样的数字范围
        if(target == nums[index]){
            left = index;
            while(left!=0 && nums[left-1] == target )
                left--;
            right = index;
            while(right<nums.length-1 && nums[right+1] == target )
                right++;
            res[0] = left;
            res[1] = right;
            return res;
        }
        //如果中间位置的num比target小，就调用递归在数组的右半边去查找
        if(target > nums[index])
            return searchRange(nums,index+1,R,target,res);
        //如果中间位置的num比target大，就调用递归在数组的左半边去查找
        if(target < nums[index])
            return searchRange(nums,L,index-1,target,res);
        return res;
    }

    public static void main(String[] args) {
        test20 t = new test20();
        int[] nums = new int[]{0,1,2,3,4,4,4};
        System.out.println(t.searchRange(nums,2));
    }
}

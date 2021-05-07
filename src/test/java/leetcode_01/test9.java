package leetcode_01;

import java.util.Arrays;

public class test9 {
    public int[] insert(int[] nums, int m,int i){
        boolean flag = false;
        for(int k=0; k<m; k++){
            if(nums[k] > i){
                flag = true;
                for(int j=m; j>k; j--){
                    nums[j]=nums[j-1];
                }
                nums[k] = i;
                return nums;
            }
        }
        if(!flag){
            nums[m] = i;
        }
    return nums;
    }
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {    //返回值待会要改回来
        if(nums2.length==0){
            return nums1;
        }else {
            for(int i=0; i<n; i++){
                nums1 = insert(nums1,m,nums2[i]);
                m++;
            }
            return nums1;
        }
    }
    public static void main(String[] args) {
        test9 t = new test9();
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int[] nums = t.merge(nums1,1,nums2,0);
        System.out.println(Arrays.toString(nums));
    }
}

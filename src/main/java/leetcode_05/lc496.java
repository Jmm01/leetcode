package leetcode_05;
//496.下一个更大元素1
public class lc496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] results = new int[nums1.length];
        for(int i=0; i< nums1.length; i++){
            results[i] = nextGreater(nums1[i],nums2);
        }
        return results;
    }

    //私有方法，在指定数组中寻找index这个元素右边比其大的第一个元素返回，否则就返回-1
    private int nextGreater(int num, int[] nums){
        for(int k=0; k<nums.length; k++){
            if(nums[k] == num) {
                for(; k<nums.length; k++){
                    if(nums[k] > num)
                        return nums[k];
                }
            }
        }
        return -1;
    }

    public int nextGreater2(int num, int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if(num == nums[i])
                for(; i < nums.length; i++){
                    if(num < nums[i])
                        return nums[i];
                }
        }
        return -1;
    }

    public static void main(String[] args) {
        lc496 lc496 = new lc496();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] ints = lc496.nextGreaterElement(nums1, nums2);
        for (int i : ints) {
            System.out.println(i);
        }
       // System.out.println(lc496.nextGreaterElement(nums1,nums2).toString());
    }
}

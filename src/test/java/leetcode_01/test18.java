package leetcode_01;

public class test18 {
    public void moveZeroes(int[] nums) {
        int i =0;
        if(nums.length == 0)
            return;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != 0 && i==j)
                i++;
            else if(nums[j] != 0 && i!=j) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        test18 t = new test18();
        int[] nums = new int[]{0,1};
        t.moveZeroes(nums);
        System.out.println(nums);

    }
}

package leetcode_01;

public class test24 {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i=1; i<nums.length; i++){
            res = res^nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        test24 t = new test24();
        int res = t.singleNumber(new int[]{1,2,3,4,1,3,2});
        System.out.println(res);
    }
}

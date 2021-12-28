package leetcode_01;

public class test22 {
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == res)
                count = count+1;
            else if(nums[i] != res) {
                count = count-1;
                if (count == 0)
                    res = nums[i+1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test22 t = new test22();
        int[] nums = new int[]{3,2,3};
        System.out.println(t.majorityElement(nums));
    }
}

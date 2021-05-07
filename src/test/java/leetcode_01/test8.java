package leetcode_01;

public class test8 {
        public int maxSubArray(int[] nums) {
            int max = nums[0];
            int sum = 0;
            for(int i=0; i<nums.length; i++){
                sum= sum + nums[i];
                if(sum>max){
                    max = sum;
                }
                if(sum < 0) {
                    sum = 0;
                }
            }
            return max;
        }
    public static void main(String[] args) {
        test8 t = new test8();
        System.out.println(t.maxSubArray(new int[]{-2,1}));
    }

}

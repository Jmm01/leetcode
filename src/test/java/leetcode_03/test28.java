package leetcode_03;

public class test28 {
    //55.跳跃游戏
    public boolean canJump(int[] nums) {
        if(nums == null)
            return false;
        //存储跳的最大距离
        int distance = 0;

        for(int i=0; i<nums.length; i++){
            //此时distance到不了i的位置，说明无法跳过去
            if(i > distance)
                return false;
            //更新前i个元素能跳到的最远位置
            distance = Math.max(i + nums[i],distance);
            //如果最远位置能够到达最后，那么就返回判断结果
            if(distance >= nums.length-1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        test28 t = new test28();
        int[] nums = new int[]{3,2,1,0,4};
        System.out.println(t.canJump(nums));
    }

}

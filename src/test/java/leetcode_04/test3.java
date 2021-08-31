package leetcode_04;

public class test3 {
    //45.跳跃游戏II
    public int jump(int[] nums){
        int end = 0, maxDistance = 0, steps = 0;
        for(int i=0; i<nums.length-1; i++){
            //计算能跳到的最远位置
            maxDistance = Math.max(maxDistance, i+nums[i]);
            //遍历当前能跳的范围[i,end]内能跳的最远位置，到边界后，更新边界，步数加一
            //保证每步跳的都是当前可以到达的范围内能跳最远的一步
            if(i == end){
                end = maxDistance;
                steps++;
                //如果当前能跳的最远范围大于等于数组长度，就直接返回结果
                if(maxDistance >= nums.length-1){
                    return steps;
                }
            }

        }
        return steps;
    }

    public static void main(String[] args) {
        test3 t = new test3();
        int[] nums = new int[]{2,3,1,1,4};
        System.out.println(t.jump(nums));
    }
}

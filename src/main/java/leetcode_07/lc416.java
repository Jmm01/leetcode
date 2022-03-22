package leetcode_07;

public class lc416 {


    /**
     * 递归--->记忆化搜索
     * 背包问题，从nums个物品中，选出和为sum/2的nums/2个物品
    //memo[i][c] 表示使用索引为[0...i]的这些元素，是否可以完全填充一个容量为c的背包
    //0表示未计算； -1表示不可以填充； 1表示可以填充
    int[][] memo;
    //
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        //如果总和为奇数，肯定不能均分为两份
        if(sum % 2 != 0){
            return false;
        }

        memo = new int[nums.length][sum/2+1];
        //递归
        return tryPartition(nums, nums.length -1 , sum/2);
    }
    //使用nums[0...index],是否可以完全填充一个容量为sum的背包
    boolean tryPartition(int[] nums, int index, int sum){
        if(sum == 0)
            return true;
        //背包已经装不下了或者没有物品可选了
        if(sum < 0 || index < 0)
            return false;

        if(memo[index][sum] != 0)
            return memo[index][sum] == 1;

        //不使用使用当前物品就可以凑够sum，或者加上当前物品刚好凑够sum
        memo[index][sum] = (tryPartition(nums, index - 1, sum) ||
                tryPartition(nums, index - 1, sum - nums[index])) ? 1 : 0;
        return memo[index][sum] == 1;
    }
     */

    /**
     * 动态规划
     * @param nums
     * @return
     */
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        if(sum % 2 != 0)
            return false;

        int n = nums.length;
        //背包的容量
        int c = sum/2;
        boolean[] memo = new boolean[c+1];
        for(int i=0; i<= c; i++){
            //初始化第一行，背包为i的时候能否刚好放下nums[]的第一个元素取决于nums[0] == i;
            memo[i] = (nums[0] == i);
        }

        for(int i=1; i<n; i++){
            //在原来记录的memo上从右往左更新覆盖
            for(int j=c; j>=nums[i]; j--){
                memo[j] = memo[j] || memo[j-nums[i]];
            }
        }
        return memo[c];

    }
}

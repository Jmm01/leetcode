package leetcode_08;

public class lc2044 {
    //dfs不会做
    int[] nums;
    int max = 0, ans = 0;
    public int countMaxOrSubsets(int[] nums) {
        this.nums = nums;
        dfs(0,0);
        return ans;
    }
    void dfs(int u, int val){
        if(u == nums.length){
            if(val > max){
                max = val;
                ans = 1;
            }else if(val == max){
                ans++;
            }
            return;
        }
        dfs(u+1, val);
        dfs(u+1,val|nums[u]);
    }
}

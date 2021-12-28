package leetcode_04;

import java.util.*;

public class test18 {

    //47.全排列II
    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        List<List<Integer>> ress = new ArrayList<>();
        //数组为空时，返回空列表
        if(nums.length == 0)
            return ress;
        //数组只有一个元素时，返回一个包含一种情况的列表
        if(nums.length == 1){
            List temp = new ArrayList<>();
            temp.add(nums[0]);
            ress.add(temp);
            return ress;
        }
        //给数组排序，方便后面重复元素分支的剪枝操作
        Arrays.sort(nums);

        boolean[] used = new boolean[len];
        Deque<Integer> path = new ArrayDeque<>(len);
        dfs(nums, len, 0, used, path,ress);
        return ress;
    }

    //写回溯函数
    private void dfs(int[] nums,int len, int depth, boolean[] used, Deque<Integer> path, List<List<Integer>> ress){
        //如果回溯深度已经等于数组长度时，path已经是一种排列情况，加入结果集
        if(depth == len){
            ress.add(new ArrayList<>(path));
            return;
        }
        //如果某个元素已经使用过，就跳过重复元素，避免结果重复
        for(int i=0; i<len; ++i){
            if(used[i])
                continue;

            // 剪枝条件：i > 0 是为了保证 nums[i - 1] 有意义
            // 写 !used[i - 1] 是因为 nums[i - 1] 在深度优先遍历的过程中刚刚被撤销选择
            if(i>0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }

            path.addLast(nums[i]);
            used[i] = true;

            dfs(nums, len,depth+1, used, path, ress);
            // 回溯部分的代码，和 dfs 之前的代码是对称的
            used[i] = false;
            path.removeLast();
        }
    }
    public static void main(String[] args) {
        test18 s = new test18();
        System.out.println(s.permuteUnique(new int[]{1}));
    }

}

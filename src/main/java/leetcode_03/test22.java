package leetcode_03;

import java.util.*;

public class test22 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> ress = new ArrayList<List<Integer>>();
        if(len == 0)
            return ress;

        Arrays.sort(candidates);
        Deque<Integer> res = new ArrayDeque<Integer>();
        dfs(candidates,0,len,target,res,ress);
        return ress;

    }
    private void dfs(int[] candidates, int begin, int len, int target, Deque<Integer> res, List<List<Integer>> ress) {
        //递归终止条件
        if(target == 0){
            ress.add(new ArrayList<Integer>(res));
            return;
        }
        //从begin开始是为了防止结果重复
        for(int i = begin; i<len; i++){
            //如果差为负数，这条支线就舍弃
            if(target - candidates[i] < 0){
                break;
            }
            //记录每一步的数值
            res.addLast(candidates[i]);
            dfs(candidates, i , len, target - candidates[i], res,ress);
            //移除栈顶元素，回退一步继续遍历
            res.removeLast();
        }

    }

    public static void main(String[] args) {
        test22 t = new test22();
        int[] nums = new int[]{2,3,6,7};
        System.out.println(t.combinationSum(nums,7));
    }



}

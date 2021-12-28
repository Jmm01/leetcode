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
        //�ݹ���ֹ����
        if(target == 0){
            ress.add(new ArrayList<Integer>(res));
            return;
        }
        //��begin��ʼ��Ϊ�˷�ֹ����ظ�
        for(int i = begin; i<len; i++){
            //�����Ϊ����������֧�߾�����
            if(target - candidates[i] < 0){
                break;
            }
            //��¼ÿһ������ֵ
            res.addLast(candidates[i]);
            dfs(candidates, i , len, target - candidates[i], res,ress);
            //�Ƴ�ջ��Ԫ�أ�����һ����������
            res.removeLast();
        }

    }

    public static void main(String[] args) {
        test22 t = new test22();
        int[] nums = new int[]{2,3,6,7};
        System.out.println(t.combinationSum(nums,7));
    }



}

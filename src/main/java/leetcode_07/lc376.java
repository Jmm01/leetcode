package leetcode_07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lc376 {
    //动态规划，求最长的摆动子序列的长度
    //自己做出来了！
    public int wiggleMaxLength(int[] nums) {

//        if(nums.length == 0)
//            return 0;
//
//        //memo[0]表示以nums[i]为结尾的最长摆动子序列的长度,key表示长度，value表示摆动方向
//        //0为未计算，-1为减，1为增
//        //初始化memo
//        List<int[]> memo = new ArrayList<>(nums.length);
//        for(int i=0; i<nums.length; i++){
//            memo.add(new int[]{1,0});
//        }
//
//        for(int i=1; i<nums.length; i++){
//            for(int j=0; j<i; j++){
//                int[] memoJ = memo.get(j);
//                if((memoJ[1] == 0 && nums[j] != nums[i]) || (memoJ[1] == 1 &&  nums[j] > nums[i]) || (memoJ[1] == -1 &&  nums[j] < nums[i])){
//                    memo.add(i,new int[]{Math.max(memo.get(i)[0], 1+memo.get(j)[0]),nums[i] > nums[j] ? 1:-1});
//                }
//            }
//        }
//        int res = 1;
//        for(int i=0; i<nums.length; i++)
//            res = Math.max(res, memo.get(i)[0]);
//        return res;

        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int up = 1;
        int down = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            }
            if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }
        return Math.max(up, down);
    }

    public static void main(String[] args) {
        lc376 lc = new lc376();
        System.out.println(lc.wiggleMaxLength(new int[]{1,5,3,10,2,8,10,5}));
        System.out.println(lc.wiggleMaxLength(new int[]{1,2}));
        System.out.println(lc.wiggleMaxLength(new int[]{1,1}));

    }
}

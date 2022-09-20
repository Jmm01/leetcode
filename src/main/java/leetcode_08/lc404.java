package leetcode_08;

import java.util.ArrayList;

public class lc404 {
    public int sumOfLeftLeaves(TreeNode root) {
        ArrayList nums = new ArrayList();
        ArrayList<Integer> integers = leftNode(root, nums, false);
        int sum = 0;
        for(int num:integers){
            sum += num;
        }
        return sum;
    }

    private ArrayList<Integer> leftNode(TreeNode root, ArrayList nums, boolean isLeft){
        if(root == null)
            return nums;
        if(root.left == null && root.right == null ){
            if(isLeft)
                nums.add(root.val);
            return nums;
        }
        leftNode(root.left,nums,true);
        leftNode(root.right,nums,false);
        return nums;
    }

    public static void main(String[] args) {
        lc404 lc = new lc404();
//        TreeNode n15 = new TreeNode(15,null,null);
//        TreeNode n7 = new TreeNode(7,null,null);
        TreeNode n9 = new TreeNode(9,null,null);
//        TreeNode n20 = new TreeNode(20,n15,n7);
        TreeNode n3 = new TreeNode(3,n9,null);
        System.out.println(lc.sumOfLeftLeaves(n3));


    }
}

package leetcode_03;

import leetcode_02.ListNode;
import leetcode_02.test27;

public class test2 {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        boolean res = Balanced(root);
//        System.out.println(root.val + "+" + Balanced(root));
        if(!res)
            return false;
        return  isBalanced(root.right) && isBalanced(root.left);
    }
    private int high(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(high(node.left),high(node.right))+1;
    }
    private boolean Balanced(TreeNode node){
        if(node == null)
            return true;
        int right = high(node.right);
        int left = high(node.left);
        if(Math.abs(right - left)>1)
            return false;
        return true;
    }
    public static void main(String[] args) {
        test2 t = new test2();
        TreeNode l20 = new TreeNode(8,null,null);
        TreeNode l19 = new TreeNode(6,null,null);
        TreeNode l18 = new TreeNode(1,null,null);
        TreeNode l16 = new TreeNode(-1,null,l20);
        TreeNode l17 = new TreeNode(5,null,null);
        TreeNode l14 = new TreeNode(1,l17,l18);
        TreeNode l15 = new TreeNode(3,null,l19);
        TreeNode l12 = new TreeNode(2,l14,null);
        TreeNode l13 = new TreeNode(4,l15,l16);
        TreeNode l11 = new TreeNode(0,l12,l13);

        boolean res = t.isBalanced(l11);
        System.out.println(res);
    }
}

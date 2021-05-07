package leetcode_01;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class test26 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else {
            return  Math.max(maxDepth(root.right)+1,maxDepth(root.left)+1);
        }
    }
}

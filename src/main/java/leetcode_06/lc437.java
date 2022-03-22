package leetcode_06;

import leetcode_06.TreeNode;

public class lc437 {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return 0;
        int res = findPath(root,targetSum);
        res += pathSum(root.left, targetSum);
        res += pathSum(root.right, targetSum);

        return res;
    }
    private int findPath(TreeNode node, int num){
        if(node == null)
            return 0;

        int res = 0;
        if(node.val == num)
            res += 1;

        res += findPath(node.left, num-node.val);
        res += findPath(node.right,num-node.val);

        return res;
    }
}

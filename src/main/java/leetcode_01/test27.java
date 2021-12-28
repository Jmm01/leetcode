package leetcode_01;

import java.util.concurrent.atomic.AtomicInteger;

public class test27 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return Tree(nums,0,nums.length-1);
    }
    private TreeNode Tree(int[] nums,int l, int r) {
        if(r<l)
            return null;
        int m = (r+l)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = Tree(nums, l, m-1);
        root.right = Tree(nums, m+1, r);
        return root;
    }
}


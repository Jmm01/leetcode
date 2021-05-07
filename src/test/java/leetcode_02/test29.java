package leetcode_02;

import java.util.ArrayList;
import java.util.List;

public class test29 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        return inOrder(root,res);
    }


    private List<Integer> inOrder(TreeNode node,List res){

        if(node == null)
            return res;
        else {
            inOrder(node.left,res);
            res.add(node.val);
            inOrder(node.right,res);
        }

        return res;
    }
}

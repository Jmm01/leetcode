package leetcode_05;

import java.util.ArrayList;
import java.util.List;

//二叉树的前序遍历
public class lc144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList list = new ArrayList();
        return preorder(root,list);
    }
    private List<Integer> preorder(TreeNode node, List list) {
        if(node == null)
            return list;
        else {
            list.add(node.val);
            preorder(node.left,list);
            preorder(node.right, list);
        }
        return list;
    }
}

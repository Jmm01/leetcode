package leetcode_08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class lc653 {
    public boolean findTarget(TreeNode root, int k) {
        if(root.left == null && root.right == null)
            return false;
        ArrayList<Integer> list = new ArrayList();
        list = preorder(root, list);
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == k-list.get(i))
                continue;
            if(findNum(root,k-list.get(i)))
                return true;
        }
        return false;
    }
    private ArrayList<Integer> preorder(TreeNode root, ArrayList list){
        if(root == null)
            return list;
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
        return list;
    }
    private boolean findNum(TreeNode node, int num) {
        if(node == null)
            return false;
        else if(node.val == num)
            return true;
        else if (node.val < num)
            return findNum(node.right,num);
        else
            return findNum(node.left,num);
    }


    public static void main(String[] args) {
        //[2,0,3,-4,1]
        //-1
        TreeNode n1 = new TreeNode();
        TreeNode n2 = new TreeNode(3,null,null);
//        TreeNode n3 = new TreeNode(3,null,null);
//        TreeNode n4 = new TreeNode(0,n1,n2);
//        TreeNode n5 = new TreeNode(6,null,n3);
        TreeNode n6 = new TreeNode(2,n1,n2);
        lc653 lc = new lc653();
        System.out.println(lc.findTarget(n6, 6));

    }
}

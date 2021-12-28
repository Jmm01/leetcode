package leetcode_01;

public class test20 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p!=null&&q!=null&&p.val==q.val){
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode treeLeft = new TreeNode(2,null,null);
        TreeNode treeRight = new TreeNode(3,null,null);
        TreeNode tree1 = new TreeNode(1,treeLeft,null);
        TreeNode tree2 = new TreeNode(1,null,treeLeft);
        test20 t = new test20();
        System.out.println(t.isSameTree(tree1,tree2));

    }
}
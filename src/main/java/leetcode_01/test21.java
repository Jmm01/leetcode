package leetcode_01;

public class test21 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        else
            return isSymmetric(root.left,root.right);

    }
    private boolean isSymmetric(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }else if(left != null && right != null && left.val == right.val){
            return  isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
        }else
            return false;
    }
    public static void main(String[] args) {
        TreeNode treeLeft3 = new TreeNode(3,null,null);
        TreeNode treeRight3 = new TreeNode(3,null,null);
        TreeNode treeLeft4 = new TreeNode(4,null,null);
        TreeNode treeRight4 = new TreeNode(4,null,null);
        TreeNode treeLeft = new TreeNode(2,treeLeft3,treeLeft4);
        TreeNode treeRight = new TreeNode(2,treeRight4,treeRight3);
        TreeNode root = new TreeNode(1,treeLeft,treeRight);
        test21 t = new test21();
        System.out.println(t.isSymmetric(root));

    }
}

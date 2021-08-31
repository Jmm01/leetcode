package leetcode_04;

public class test14 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return ArrayToBST(nums,0,nums.length);

    }
    private TreeNode ArrayToBST(int[] nums, int L, int R){
        if(L == R)
            return null;
        int mid = (R-L)/2 + L;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = ArrayToBST(nums,L,mid);
        node.right = ArrayToBST(nums,mid+1,R);
        return node;
    }

    public static void main(String[] args) {
        test14 t = new test14();
        int[] nums = new int[]{-10,-3,0,5,9};
        System.out.println(t.sortedArrayToBST(nums));
    }

}

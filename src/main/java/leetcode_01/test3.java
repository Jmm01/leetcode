package leetcode_01;

public class test3 {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        if (nums[nums.length - 1] < target) {
            res = nums.length;
        }
        label:
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                res = i;
                break label;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test3 t = new test3();
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 8;
        System.out.println(t.searchInsert(nums, target));
    }
}

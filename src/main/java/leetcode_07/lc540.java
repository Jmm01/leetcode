package leetcode_07;

public class lc540 {
    public int singleNonDuplicate(int[] nums) {
        int sing = sing(nums, 0, nums.length-1);
        return sing;
    }
    private int sing(int[] nums, int l, int r){
        if(l == r)
            return nums[l];
        int mid = (r-l)/2 + l;
        int left = l, right = r;

        if((mid-l)%2 == 1 && nums[mid] == nums[mid-1]){
            return sing(nums, mid+1, right);
        }else if((mid-l)%2 == 0 && nums[mid] == nums[mid+1]){
            return sing(nums, mid+2, right);
        }else if((r-mid)%2 == 1 && nums[mid] == nums[mid+1]){
            return sing(nums, left, mid-1 );
        }else if((r-mid)%2 == 0 && nums[mid] == nums[mid-1]){
            return sing(nums, left, mid-2 );
        }else {
            return nums[mid];
        }
    }

    public static void main(String[] args) {
        lc540 lc = new lc540();
        System.out.println(lc.singleNonDuplicate(new int[]{1,1,2,3,3}));
    }
}

package leetcode_09;

public class lc80 {
    public int removeDuplicates(int[] nums) {
        int i=0;
      for(int num:nums){
          if(i<2 || num>nums[i-2])
              nums[i++] = num;
        }
      return i;
    }

    public static void main(String[] args) {
        lc80 lc = new lc80();
        System.out.println(lc.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));

        System.out.println(lc.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
        System.out.println(lc.removeDuplicates(new int[]{1,1,1,2,2,2,3,3}));
        System.out.println(lc.removeDuplicates(new int[]{1,1,1}));


    }
}

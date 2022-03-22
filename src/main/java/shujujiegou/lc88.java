package shujujiegou;

public class lc88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m+n-1;
        int i = m-1;
        int j = n-1;
        while(index >= 0){
            if(i < 0){
                for(int k=0; k<=index; k++)
                    nums1[k] = nums2[k];
                return;
            }else if(j < 0)
                return;

            if( nums1[i] >= nums2[j])
                nums1[index--] = nums1[i--];
            else
                nums1[index--] = nums2[j--];

        }
        return;
    }

    public static void main(String[] args) {
        lc88 lc = new lc88();
        lc.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}

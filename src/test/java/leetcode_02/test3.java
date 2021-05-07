package leetcode_02;

public class test3 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length+nums2.length];
        if(nums1 == null){
            array = nums2;
        }else if(nums2 == null){
            array = nums1;
        }else {
            int i=0;
            int j=0;
            int k=0;
            while(i<nums1.length && j<nums2.length) {
                if(nums1[i]<nums2[j]) {
                    array[k++] = nums1[i++];
                }else {
                    array[k++] = nums2[j++];
                }
            }
            //Èônums1ÓĞÊ£Óà
            while(i<nums1.length) {
                array[k++] = nums1[i++];
            }
            //Èônums2ÓĞÊ£Óà
            while(j<nums2.length) {
                array[k++] = nums2[j++];
            }
        }
        int len = array.length;
        if(len%2==1){
            return array[(len-1)/2];
        }else {
            return (array[len/2] + array[len/2-1])/2.0;
        }
    }

    public static void main(String[] args) {
        test3 t = new test3();
        int[] a = new int[]{};
        int[] b = new int[]{0,0};
        System.out.println(t.findMedianSortedArrays(a,b));
    }
}

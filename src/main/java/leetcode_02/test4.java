package leetcode_02;

import java.util.ArrayList;
import java.util.TreeSet;

public class test4 {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set1 = new TreeSet<Integer>();
        ArrayList res = new ArrayList();
        for(int num : nums1)
            set1.add(num);
        for(int num:nums2){
            if(set1.contains(num)){
                res.add(num);
                set1.remove(num);
                if(set1.size()==0){
                    break;
                }
            }
        }
        int[] rres = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            rres[i] = (Integer) res.get(i);
        }
        return  rres;
    }
}

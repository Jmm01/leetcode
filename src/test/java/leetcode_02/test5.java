package leetcode_02;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class test5 {
    public int[] intersect(int[] nums1, int[] nums2) {
        TreeMap map1 = new TreeMap();
        ArrayList res = new ArrayList();
        for(int num : nums1){
            if(!map1.containsKey(num)){
                map1.put(num,1);
            }else {
                map1.put(num, (Integer) map1.get(num) + 1);
            }
        }
        for(int num:nums2){
            if(map1.containsKey(num)){
                res.add(num);
                map1.put(num, (Integer) map1.get(num) - 1);
                if((Integer)map1.get(num)==0){
                    map1.remove(num);
                }
                if(map1.size()==0){
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
